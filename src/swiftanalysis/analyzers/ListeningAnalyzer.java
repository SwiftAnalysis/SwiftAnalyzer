package swiftanalysis.analyzers;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import swiftanalysis.AST;

public class ListeningAnalyzer extends ProjectAnalyzer {

    private ParseTreeListener listener;

    public ListeningAnalyzer(ParseTreeListener listener) {
        this.listener = listener;
    }

    @Override
    protected void analyzeFile(AST ast) {
        ParseTreeWalker.DEFAULT.walk(listener, ast.getTree());
    }
}
