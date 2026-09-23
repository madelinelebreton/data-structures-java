# Assignment 5 — Heaps and Priority Queues, Graphs, & Hashing

Three independent parts, each stated as a task in the write-up and verified with its own
test driver.

## Part 1 — `part1-heap-sort`: in-place heap sort
> Make the heap sort algorithm more efficient by writing a method that will build a heap
> in place using the array to be sorted.

`HeapSort.java` builds the heap in place (`buildHeap`, starting from the last non-leaf
node and heapifying down — an O(n) build rather than inserting one element at a time),
then repeatedly extracts the root and re-heapifies the reduced heap. Sorts in
**descending** order. Includes a phone-contact sorting demo (`Contact.java` /
`SortPhoneList.java`). Verified against 6 cases: in-order, random, reverse-order,
duplicates, single-element, and empty.

```
cd part1-heap-sort
javac *.java jsjf/*.java jsjf/exceptions/*.java
java TestHeapSort
```

## Part 2 — `part2-graph`: adjacency-matrix graph
> Complete the implementation of Graph.java using an adjacency matrix.

`Graph.java` completes the course library's `GraphADT` using an adjacency matrix.
`TestGraph.java` verifies vertex/size management (including an edge case: adding then
removing an empty-string vertex), edges, iteration, and traversal.

```
cd part2-graph
javac *.java jsjf/*.java jsjf/exceptions/*.java
java TestGraph
```

## Part 3 — `part3-hash-table`: dynamically resizable hash table
> Implement a dynamically resizable hash table to store book names and 10-digit ISBN
> numbers.

`HashTable.java` hashes on the ISBN with linear probing to resolve collisions, and
**doubles its capacity** once it grows too full (verified going from size 11 to 22 as
more books are added). `TestHashTable.java` verifies `get()` and `remove()`, including
lookups for keys not in the table.

```
cd part3-hash-table
javac *.java
java TestHashTable
```

Full write-up (task descriptions plus test output for all three parts): [`Assignment5_Report.pdf`](./Assignment5_Report.pdf).
