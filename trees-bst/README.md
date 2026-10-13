# Trees & Binary Search Trees

## Part 1: Binary Decision Tree
Extends the course library's `LinkedBinaryTree` to build a working binary decision
tree (`DecisionTree.java`), driven by `BackPainAnalyzer.java`, which walks the tree by
asking yes/no questions read from `input.txt` and prints a diagnosis at each leaf.

```
cd part1-decision-tree
javac *.java jsjf/*.java jsjf/exceptions/*.java
java BackPainAnalyzer
```

## Part 2: Linked Binary Search Tree
A complete binary search tree implementation — `addElement`, `removeElement`,
`removeMin`/`removeMax`, `findMin`/`findMax`, `find`, and recursive traversal; tested
by `TestLinkedBinarySearchTree.java`.

```
cd part2-binary-search-tree
javac *.java jsjf/*.java jsjf/exceptions/*.java
java TestLinkedBinarySearchTree
```


`jsjf/` in both parts holds provided support code (ADT interfaces, exceptions,
base tree classes) needed to compile
