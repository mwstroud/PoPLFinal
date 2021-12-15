# PoPLFinal

12/15/21
CS 4450
Pete Canfield, Chloe Jones, Matt Stroud

Antlr4 grammar defines lexer and parser rules for Python3 target language.
The lexer and parser are also defined so that it can parse Python3 code. An example script is provided for testing.

#### Requirements:
Java 17<
antlr4 latest .jar file
```
pip install antlr4-python3-runtime
```

#### How to run
First, you must generate the Lexer and Parser from the .g4 grammar file.
```
java org.antlr.v4.Tool supercrit.g4
```
or if you have created an alias for java org.antlr.v4.Tool, you can call that.
The files that are generated from this command are already included in the repository.

Next, run the main script on the testing code to see if the grammar works.


#### Generating the Parse Tree
...
