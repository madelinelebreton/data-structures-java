# Assignment 4 — Trees & Binary Search Trees

No separate write-up was submitted for this assignment — the two parts below are
documented directly from the code and its test drivers.

## Part 1 — `part1-decision-tree`: binary decision tree
Extends the course library's `LinkedBinaryTree` to build a working binary decision
tree (`DecisionTree.java`), driven by `BackPainAnalyzer.java`, which walks the tree by
asking yes/no questions read from `input.txt` and prints a diagnosis at each leaf.

```
cd part1-decision-tree
javac *.java jsjf/*.java jsjf/exceptions/*.java
java BackPainAnalyzer
```

## Part 2 — `part2-binary-search-tree`: `LinkedBinarySearchTree`
A complete binary search tree implementation — `addElement`, `removeElement`,
`removeMin`/`removeMax`, `findMin`/`findMax`, `find`, and recursive traversal — tested
by `TestLinkedBinarySearchTree.java`.

```
cd part2-binary-search-tree
javac *.java jsjf/*.java jsjf/exceptions/*.java
java TestLinkedBinarySearchTree
```

**Known issue:** the test driver calls `removeElement()` on a value that was never
added to the tree, without a try/catch around it — running it as-is throws an uncaught
`ElementNotFoundException` partway through and cuts the demo short. Worth wrapping in a
try/catch if you want a clean end-to-end run.

`jsjf/` in both parts holds course-provided support code (ADT interfaces, exceptions,
base tree classes) needed to compile — see the repo's top-level README for details.
