package swiftanalysis;

import swiftanalysis.analyzers.Analyzer;
import swiftanalysis.analyzers.EmptyCatchBlockCounter;
import swiftanalysis.analyzers.MscrMetricsProjectAnalyzer;
import swiftanalysis.analyzers.ProjectAnalyzer;
import swiftanalysis.generated.SwiftLexer;
import swiftanalysis.generated.SwiftParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.pattern.ParseTreeMatch;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

/**
 * Analyzes given Swift projects with the analyzer of choice.
 */
public class SwiftAnalyzer {

    /**
     * Analyzer of choice to analyze the project(s)
     */
    private static Analyzer analyzer = new EmptyCatchBlockCounter();

    /**
     * swiftanalysis.SwiftAnalyzer method accepts one or more project paths to analyze.
     *
     * @param args array of project paths
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Specify one or more project paths");
            return;
        }

        ProjectParser parser = new ProjectParser();
        for (String projectPath : args) {
            File directory = new File(projectPath);
            Stream<AST> treeStream = parser.parseProject(directory);
            analyzer.analyzeProject(directory, treeStream);
        }
        analyzer.allProjectsDone();
    }

    private static void analyzeFile(File file) throws IOException {
        System.out.println("Analyzing " + file.getAbsolutePath());
        CharStream input = new ANTLRInputStream(new FileReader(file));
        SwiftLexer lexer = new SwiftLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SwiftParser parser = new SwiftParser(tokens);
        SwiftParser.TopLevelContext tree = parser.topLevel();

//        System.out.println(tree.toStringTree(parser));


//        JFrame frame = new JFrame("Antlr swiftanalysis.AST");
//        JPanel panel = new JPanel();
//        TreeViewer viewr = new TreeViewer(Arrays.asList(
//                parser.getRuleNames()),tree);
//        panel.add(viewr);
//        frame.add(panel);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setSize(800,600);
//        frame.setVisible(true);


//        ParseTreeWalker.DEFAULT.walk(createListener(), tree);

        String xpath = "//*"; // get children of blockStatement
        String treePattern = "catch { }";
        ParseTreePattern p =
                parser.compileParseTreePattern(treePattern,
                        SwiftParser.RULE_catchClause);
        List<ParseTreeMatch> matches = p.findAll(tree, xpath);
        System.out.println(matches);
    }

}