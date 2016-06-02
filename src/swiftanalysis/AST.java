package swiftanalysis;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;

/**
 * DTO to combine file name, AST and parser
 */
public class AST {

    private File file;
    private ParseTree tree;
    private Parser parser;

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
}
