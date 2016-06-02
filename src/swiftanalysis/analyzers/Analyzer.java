package swiftanalysis.analyzers;

import swiftanalysis.AST;

import java.io.File;
import java.util.stream.Stream;

/**
 * Analyzes a project
 */
public interface Analyzer {

    void analyzeProject(File projectPath, Stream<AST> treeStream);

    void allProjectsDone();
}
