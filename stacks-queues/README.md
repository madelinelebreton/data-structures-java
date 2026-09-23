# Assignment 2 — Stacks & Queues

Three self-contained implementations, each verified against expected output for its
core operations plus randomized stress tests (random-length runs of random positive and
negative integers, checking size/top/peek after each).

## Part 1 — `part1-array-stack`: array-backed stack
A standard array implementation of a stack (`ArrayStack`), with the bottom of the stack
fixed at index 0. Tested against expected values for push, pop, peek, isEmpty, and size,
then stress-tested with a random stack of positive and negative integers (including
large values).

```
cd part1-array-stack
javac *.java && java Driver
```

## Part 2 — `part2-linked-stack`: fixed-capacity "drop-out" stack
A linked-list stack (`LinkedStack`) with a twist: its capacity is fixed at construction
(`n`), and once the stack holds `n` elements, pushing a new one causes the **bottom**
element to drop out rather than growing the stack. Verified with a fixed capacity of 5 —
pushing a 6th element confirms the oldest element is dropped while the rest of the stack
shifts as expected.

```
cd part2-linked-stack
javac *.java && java Driver
```

## Part 3 — `part3-linked-queue`: double-ended queue
Despite the "queue" name, this implements a full **deque**: `enqueueFront`,
`enqueueRear`, `dequeueFront`, `dequeueRear`, plus `first`/`last` accessors. Verified by
enqueueing and dequeueing from both ends and checking `front`/`rear`/`size` after each
operation.

```
cd part3-linked-queue
javac *.java && java Driver
```

Full write-up (test output for all three parts): [`Assignment2_Report.pdf`](./Assignment2_Report.pdf).
