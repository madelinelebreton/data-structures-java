# Data Structures & Algorithms in Java

Coursework from COMP 2231 (Data Structures and Algorithms), completed as part of my
Bachelor of Mechatronics Engineering at McMaster University. Five assignments moving
from algorithm analysis through core data structures to more advanced ones: sorting,
stacks/queues, list-based ADTs, trees, heaps, graphs, and hash tables.

Each assignment folder is self-contained, can be compiled/run independently, and has
its own README with implementation notes, how-to-run instructions, and (where one
exists) a link to the original write-up.

## Contents

| Folder | Topic | What's implemented |
|---|---|---|
| [`assignment1-algorithm-analysis`](./assignment1-algorithm-analysis) | Searching & sorting | Instrumented shellSort, bubbleSort, and bubbleSort2; empirical comparison of comparisons/swaps/runtime across array sizes and orderings |
| [`assignment2-stacks-queues`](./assignment2-stacks-queues) | Stacks & queues | Array-backed stack, a fixed-capacity "drop-out" linked stack, and a linked-node double-ended queue |
| [`assignment3-lists-iterators`](./assignment3-lists-iterators) | Lists & iterators | A stack and a double-ended queue, each reimplemented as thin wrappers around `java.util.LinkedList` / `java.util.ArrayList` |
| [`assignment4-trees-bst`](./assignment4-trees-bst) | Trees & binary search trees | A binary decision tree (back-pain diagnosis demo) and a full linked binary search tree (add/remove/min/max/find) |
| [`assignment5-heaps-graphs-hashing`](./assignment5-heaps-graphs-hashing) | Heaps, graphs & hashing | In-place heap sort, an adjacency-matrix graph, and a dynamically resizable hash table |

## A note on the `jsjf` folders

Several assignments build on starter/support code from the course textbook's companion
library (package `jsjf`) — abstract data type interfaces, exception classes, and some
base list/array implementations. Each part's `jsjf/` folder includes only the classes
needed to compile and run that part. The class(es) I actually wrote or completed for
each assignment are called out in that assignment's own README; everything else in
`jsjf/` is provided scaffolding.

## Assignments

1. **[Algorithm Analysis — Searching & Sorting](./assignment1-algorithm-analysis)** —
   shellSort vs. bubbleSort vs. bubbleSort2, with a full results table and performance
   graphs pulled from the write-up.
2. **[Stacks & Queues](./assignment2-stacks-queues)** — an array stack, a fixed-capacity
   "drop-out" linked stack, and a linked double-ended queue.
3. **[Lists & Iterators](./assignment3-lists-iterators)** — a stack and a double-ended
   queue, each built on `java.util.LinkedList` and `java.util.ArrayList`.
4. **[Trees & Binary Search Trees](./assignment4-trees-bst)** — a binary decision tree
   and a complete linked binary search tree. (No separate write-up for this one — see
   its README for details, plus a note on a known bug in the test driver.)
5. **[Heaps, Graphs & Hashing](./assignment5-heaps-graphs-hashing)** — in-place heap
   sort, an adjacency-matrix graph, and a resizable hash table.

---
All ten parts across the five assignments compile cleanly and run under OpenJDK 21
(only benign unchecked-generics warnings, typical of this style of generic collection
code).
