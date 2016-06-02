package swiftanalysis.analyzers;

import org.antlr.v4.runtime.tree.ParseTree;
import swiftanalysis.AST;

import java.io.File;
import java.util.stream.Stream;

/**
 * Base analyzer that anal
 */
public abstract class ProjectAnalyzer implements Analyzer {

    public void analyzeProject(File projectPath, Stream<AST> astStream) {
        System.out.println("#");
        System.out.println("# Project: " + projectPath.getAbsolutePath());
        System.out.println("#");
        astStream.forEach(this::analyzeFile);
        projectDone(projectPath);
    }

    protected abstract void analyzeFile(AST ast);

    protected void projectDone(File projectPath) { }

    @Override
    public void allProjectsDone() { }
}
