package swiftanalysis.analyzers.util;

import org.antlr.v4.runtime.tree.pattern.ParseTreeMatch;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;
import swiftanalysis.AST;

import java.util.List;

/**
 * Helper to assist in parse tree pattern matching.
 */
public class PatternMatching {
    private AST ast;

    /**
     * Creates an instance of this class to pattern match an AST.
     *
     * @param ast the AST
     */
    public PatternMatching(AST ast) {
        this.ast = ast;
    }

    /**
     * Searches for subtrees that adhere to the given XPath expression
     * and applies pattern matching on each subtree.
     *
     * @param pattern the parse tree pattern, refer to https://github.com/antlr/antlr4/blob/master/doc/faq/parse-trees.md
     * @param rule the production rule in the parser that the pattern adheres to
     * @param xPath the XPath expression that will be used to find subtrees
     * @return a list of matches
     */
    List<ParseTreeMatch> match(String pattern, int rule, String xPath) {
        ParseTreePattern p = ast.getParser().compileParseTreePattern(pattern, rule);
        return p.findAll(ast.getTree(), xPath);
    }

    /**
     * Searches for all possible subtrees and applies pattern matching on each subtree.
     *
     * @param pattern the parse tree pattern, refer to https://github.com/antlr/antlr4/blob/master/doc/faq/parse-trees.md
     * @param rule the production rule in the parser that the pattern adheres to
     * @return a list of matches
     */
    public List<ParseTreeMatch> match(String pattern, int rule) {
        return match(pattern, rule, "//*");
    }
}
