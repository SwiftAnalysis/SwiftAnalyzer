package swiftanalysis.analyzers;

import org.antlr.v4.runtime.tree.pattern.ParseTreeMatch;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;
import swiftanalysis.AST;
import swiftanalysis.generated.SwiftParser;

import java.io.File;
import java.util.List;

public class EmptyCatchBlockCounter extends ProjectAnalyzer {

    private int emptyCatchBlocks = 0;

    @Override
    protected void analyzeFile(AST ast) {
        PatternMatching m = new PatternMatching(ast);
        List<ParseTreeMatch> matches = m.match("catch { }", SwiftParser.RULE_catchClause);
        emptyCatchBlocks += matches.size();
    }

    @Override
    protected void projectDone(File projectPath) {
        System.out.println("Empty catch blocks: " + emptyCatchBlocks);
    }
}
