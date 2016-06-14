package swiftanalysis.analyzers;

import swiftanalysis.AST;

import java.io.File;
import java.util.stream.Stream;

/**
 * Execute a certain kind of analysis on projects.
 */
public interface Analyzer {

    /**
     * Called for each project. Implement this to analyze the project ASTs.
     *
     * @param projectPath project directory
     * @param treeStream stream of ASTs
     */
    void analyzeProject(File projectPath, Stream<AST> treeStream);

    
    public void analyzeFile(AST ast);
    
    /**
     * Called when all projects are analyzed.
     */
    void allProjectsDone();
}
