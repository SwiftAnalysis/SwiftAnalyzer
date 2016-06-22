package swiftanalysis;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;

/**
 * DTO to combine file name, AST and parser and optionally a parse error
 */
public class AST {

    private ProjectParser.ErrorListener.ParseError parseError;
    private File file;
    private ParseTree tree;
    private Parser parser;

    AST(File file, ProjectParser.ErrorListener.ParseError parseError) {
        this.file = file;
        this.parseError = parseError;
    }

    AST(File file, ParseTree tree, Parser parser) {
        this.file = file;
        this.tree = tree;
        this.parser = parser;
    }

    public File getFile() {
        return file;
    }

    public ParseTree getTree() {
        return tree;
    }

    public Parser getParser() {
        return parser;
    }

    public ProjectParser.ErrorListener.ParseError getParseError() {
        return parseError;
    }
}
