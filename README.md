# PoPLFinal

12/16/21
CS 4450
Pete Canfield, Chloe Jones, Matt Stroud

Antlr4 grammar defines lexer and parser rules for Java target language.
The lexer and parser are also defined so that it can parse Python3 code.

## Requirements:
### Java 

First, users must install the latest version of Java to their local machine. Java can be downloaded and installed [here](https://www.java.com/en/download/manual.jsp).

### Antlr
This project uses ANTLR to generate the Java lexer and parser. The install insructions can be found [here](https://levlaz.org/setting-up-antlr4-on-windows/) and are tailored for OSX, Unix, and Windows operating systems.

###Visual Studio Code ANTLR pluggin.
This project additionally uses Visual Studio Code's ANTLR pluggin for visualization of the grammar parse tree. This requires the user to install the ANTLR extension from the VSCode Marketplace. Additional Documentation can be found [here](https://github.com/mike-lischke/vscode-antlr4/blob/master/doc/grammar-debugging.md).

The VSCode Debug `launch.json` file should be the same as follows:
```
{
    "version": "2.0.0",
    "configurations": [
        {
            "name": "Debug ANTLR4 grammar",
            "type": "antlr-debug",
            "request": "launch",
            "input": "python_test_code.py",
            "grammar": "supercrit.g4",
            "startRule": "start",
            "printParseTree": true,
            "visualParseTree": true
        }
    ]
}
```

#### Generating the Parse Tree
After creating the necissary alias from the instructions above, you must generate the Lexer and Parser from the `supercrit.g4` grammar file.

```
antlr4 supercrit.g4
```

Next Generate the parse tree using the installed VSCode extension. This can be done by pressing f5 (by running the debugger) when the grammar file is open.

