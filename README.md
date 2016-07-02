# SwiftAnalyzer

This tool, written in Java, is able to perform static analysis on Swift projects.
It searches for all `.swift` files in a given directory, parses each file using
[ANTLR](http://www.antlr.org/) and produces a report with metrics.

## Features

The tool counts how often the following constructs are used in a Swift project:
- `if` statement
- `if` statement with a `nil` check (like `if x == nil` or `if x != nil`)
- `if` statement staring with `guard let`
- `guard` statement
- `guard` statement with a `nil` check (like `guard x == nil` or `guard x != nil`)
- `guard` statement starting with `guard let`
- nil coalescing operator (`??`)
- condition clause (e.g. in `if` or `while` statements) with a `nil` check (like `if x == nil` or `if x != nil`)
- optional chaining expression (like `x?`)
- forced unwrapping expression (like `x!`)
- optional type cast (`as?`)
- forced type cast (`as!`)
- `do` statement
- `try` statement
- `try!` statement
- `try?` statement
- `throw` statement
- `throws` keyword
- `rethrows` keyword
- non-generic `catch` clause
- generic `catch` clause
- non-generic `catch` clause with empty block
- generic `catch` clause with empty block
- `catch` clause using the `where` keyword
- `catch` clause with a block that only contains printing statements (`print`/`println`/`NSLog`)
- explicit variable declaration (with type annotation)
- implicit variable declaration (without type annotation)

Besides counting these constructs, it also produces a detailed list of these occurrences in JSON format.

## Usage

To run the tool, download **[SwiftAnalyzer.jar](https://github.com/JeroenNoten/SwiftAnalyzer/releases/download/v1.0.0/SwiftAnalyzer.jar)** and run:

    java -jar SwiftAnalyzer.jar path/to/project

where the project path can be any folder containing `.swift` files. This will run analysis and displays an overview of
the results in the console. Furthermore, it write a file `SwiftAnalyzerOutput.json` inside the project directory.