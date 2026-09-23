# Data Structures & Algorithms in Java

Learning Java through 5 projects from algorithm analysis through core data structures to more advanced ones: sorting,
stacks/queues, list based ADTs, trees, heaps, graphs, and hash tables.

## Contents

| Folder | Topic | What's implemented |
|---|---|---|
| [`algorithm-analysis`](./algorithm-analysis) | Searching & sorting | Instrumented shellSort, bubbleSort, and bubbleSort2; empirical comparison of comparisons/swaps/runtime across array sizes and orderings |
| [`stacks-queues`](./stacks-queues) | Stacks & queues | Array-backed stack, a fixed-capacity "drop-out" linked stack, and a linked-node double-ended queue |
| [`lists-iterators`](./lists-iterators) | Lists & iterators | A stack and a double-ended queue, each reimplemented as thin wrappers around `java.util.LinkedList` / `java.util.ArrayList` |
| [`trees-bst`](./trees-bst) | Trees & binary search trees | A binary decision tree (back-pain diagnosis demo) and a full linked binary search tree (add/remove/min/max/find) |
| [`heaps-graphs-hashing`](./heaps-graphs-hashing) | Heaps, graphs & hashing | In-place heap sort, an adjacency-matrix graph, and a dynamically resizable hash table |


## Projects

1. **[Algorithm Analysis — Searching & Sorting](./algorithm-analysis)** —
   shellSort vs. bubbleSort vs. bubbleSort2, with a full results table and performance
   graphs pulled from the write-up.
2. **[Stacks & Queues](./stacks-queues)** — an array stack, a fixed-capacity
   "drop-out" linked stack, and a linked double-ended queue.
3. **[Lists & Iterators](./lists-iterators)** — a stack and a double-ended
   queue, each built on `java.util.LinkedList` and `java.util.ArrayList`.
4. **[Trees & Binary Search Trees](./trees-bst)** — a binary decision tree
   and a complete linked binary search tree. (No separate write-up for this one — see
   its README for details, plus a note on a known bug in the test driver.)
5. **[Heaps, Graphs & Hashing](./heaps-graphs-hashing)** — in-place heap
   sort, an adjacency-matrix graph, and a resizable hash table.

