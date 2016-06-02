package swiftanalysis.analyzers;

import org.antlr.v4.runtime.tree.pattern.ParseTreeMatch;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;
import swiftanalysis.AST;

import java.util.List;

public class PatternMatching {
    private AST ast;

    public PatternMatching(AST ast) {
        this.ast = ast;
    }

    public List<ParseTreeMatch> match(String pattern, int rule, String xPath) {
        ParseTreePattern p = ast.getParser().compileParseTreePattern(pattern, rule);
        return p.findAll(ast.getTree(), xPath);
    }

    public List<ParseTreeMatch> match(String pattern, int rule) {
        return match(pattern, rule, "//*");
    }
}
