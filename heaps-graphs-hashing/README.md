# Heaps and Priority Queues, Graphs, & Hashing

## Part 1: In Place Heap Sort
`HeapSort.java` builds the heap in place (`buildHeap`, starting from the last non-leaf
node and heapifying down; an O(n) build rather than inserting one element at a time),
then repeatedly extracts the root and re-heaps the reduced heap. Sorts in
**descending** order. Includes a phone contact sorting demo (`Contact.java` /
`SortPhoneList.java`). Verified against 6 cases: in order, random, reverse order,
duplicates, single element, and empty.

```
cd part1-heap-sort
javac *.java jsjf/*.java jsjf/exceptions/*.java
java TestHeapSort
```
<img width="500" alt="image" src="https://github.com/user-attachments/assets/d333e8ba-3271-438c-8fc3-807fe1fc3388" />

## Part 2: Adjacency Matrix Graph
`Graph.java` completes `GraphADT` using an adjacency matrix.
`TestGraph.java` verifies vertex/size management (including an edge case: adding then
removing an empty string vertex), edges, iteration, and traversal.

```
cd part2-graph
javac *.java jsjf/*.java jsjf/exceptions/*.java
java TestGraph
```
<img width="500" alt="image" src="https://github.com/user-attachments/assets/adce4b0e-c4d9-4d94-9b34-7f870e4d3f0d" /> <img width="400" height="496" alt="image" src="https://github.com/user-attachments/assets/5ae0c45d-e99c-4b11-bdd7-1a7a40cbebe4" />




## Part 3: Dynamically Resizable Hash Table
`HashTable.java` implements a dynamically resizable hash table to store book names and 10-digit ISBN 
numbers. Hashes on the ISBN with linear probing to resolve collisions, and
**doubles its capacity** once it grows too full (verified going from size 11 to 22 as
more books are added). `TestHashTable.java` verifies `get()` and `remove()`, including
lookups for keys not in the table.

```
cd part3-hash-table
javac *.java
java TestHashTable
```
<img width="400" alt="image" src="https://github.com/user-attachments/assets/c58d2806-683b-41b8-95ea-c828c60b6c2e" /> <img width="500" alt="image" src="https://github.com/user-attachments/assets/ea8aa44b-dfaf-4484-ba03-7ebb9354334a" />

