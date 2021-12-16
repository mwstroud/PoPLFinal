import sys
import pdb
import antlr4
from antlr4 import *
from supercritLexer import supercritLexer
from supercritParser import supercritParser


def visualize_parse_tree(expression):
    for node in expression.getChildren():
        if isinstance(node, antlr4.TerminalNode):
                print('terminal')

def main():
    # test the parser with an input
    input = FileStream(sys.argv[1])

    lexer = supercritLexer(input)
    tokens = antlr4.CommonTokenStream(lexer)
    parser = supercritParser(tokens)

    parser.start()

if __name__ == '__main__':
    main()