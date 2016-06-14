package swiftanalysis.analyzers;

import org.antlr.v4.runtime.tree.pattern.ParseTreeMatch;
import swiftanalysis.AST;
import swiftanalysis.analyzers.util.PatternMatching;
import swiftanalysis.generated.SwiftParser;
import swiftanalysis.output.Printer;

import java.io.File;
import java.util.List;
import java.util.stream.Stream;

/**
 * Analyzer that counts the number of empty catch blocks in a project.
 */
public class EmptyCatchBlockCounter extends ProjectAnalyzer {

    /**
     * The number of empty catch blocks seen so far.
     */
    private int emptyCatchBlocks;

    public EmptyCatchBlockCounter(Printer printer) {
    	super(printer);
    }
    
    @Override
    public void analyzeProject(File projectPath, Stream<AST> astStream) {
        emptyCatchBlocks = 0;
        super.analyzeProject(projectPath, astStream);
        System.out.println("Empty catch blocks: " + emptyCatchBlocks);
    }

    /**
     * Counts the number of empty catch blocks in a file using parse tree pattern matching.
     *
     * @param ast the AST, contains file name, tree, and parser
     */
    @Override
    protected void analyzeFile(AST ast) {
        PatternMatching m = new PatternMatching(ast);
        List<ParseTreeMatch> matches = m.match("catch { }", SwiftParser.RULE_catchClause);
        emptyCatchBlocks += matches.size();
    }
}
