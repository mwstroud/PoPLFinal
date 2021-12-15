import sys
import antlr4
from antlr4 import *
from supercritLexer import supercritLexer
from supercritParser import supercritParser

# test the parser with an input
input = FileStream(sys.argv[1])
input = antlr4.ANTLRStringStream('')
lexer = supercritLexer(input)
tokens = antlr4.CommonTokenStream(lexer)
parser = supercritParser(tokens)

# print the parse tree
t = parser.expr().tree
print(t.toStringTree())