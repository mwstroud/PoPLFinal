import sys
import pdb
import antlr4
from antlr4 import *
from supercritLexer import supercritLexer
from supercritParser import supercritParser
from antlr4.tree.Trees import Trees

def traverse_tree(node):
    print(Trees.getNodeText(node))
    if isinstance(node, antlr4.TerminalNode):
        return

    for children in Trees.getChildren(node):
        traverse_tree(children)

def main():
    # test the parser with an input
    input = FileStream(sys.argv[1])

    lexer = supercritLexer(input)
    tokens = antlr4.CommonTokenStream(lexer)
    parser = supercritParser(tokens)
    tree = parser.start()
    #traverse_tree(tree)
    print(Trees.toStringTree(tree, None, parser))
    #parser.start()

if __name__ == '__main__':
    main()