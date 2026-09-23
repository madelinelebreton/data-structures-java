# Assignment 3 — Lists & Iterators

A stack and a (double-ended) queue, each reimplemented twice: once backed by
`java.util.LinkedList`, once by `java.util.ArrayList`. Every variant is tested for
normal operation, boundary conditions, and behavior on an empty collection.

## Part 1 — `LinkedListStack` (`Driver1.java`)
Stack backed by `java.util.LinkedList`. Push/pop verified against expected values;
popping/peeking an empty stack is tested explicitly and returns `null` rather than
throwing.
```
javac *.java && java Driver1
```

## Part 2 — `ArrayListStack` (`Driver2.java`)
Same behavior as Part 1, backed by `java.util.ArrayList` instead.
```
java Driver2
```

## Part 3 — `LinkedListQueue` (`Driver3.java`)
A double-ended queue backed by `java.util.LinkedList`: `enqueueFront`, `enqueueRear`,
`dequeueFront`, `dequeueRear`, `first`, `last`. Tested on both integers and strings,
including dequeueing from an empty queue.
```
java Driver3
```

## Part 4 — `ArrayListQueue` (`Driver4.java`)
Same double-ended behavior as Part 3, backed by `java.util.ArrayList`.
```
java Driver4
```

Full write-up (test output for all four parts): [`Assignment3_Report.pdf`](./Assignment3_Report.pdf).
