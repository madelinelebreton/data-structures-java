# Stacks & Queues

Three self-contained implementations, each verified against expected output for the
core operations plus randomized tests (random length runs of random +/- integers, checking size/top/peek after each).

## Part 1: Array-Backed Stack
A standard array implementation of a stack (`ArrayStack`), with the bottom of the stack
fixed at index 0. Tested against expected values for push, pop, peek, isEmpty, and size,
then stress tested with a random stack of positive and negative integers (including
large values).

```
cd part1-array-stack
javac *.java && java Driver
```
<img width="300" alt="image" src="https://github.com/user-attachments/assets/706e6dbe-efb3-4138-b613-b07d40086c08" />


## Part 2: Fixed Capacity Stack
A linked list stack (`LinkedStack`) with a twist: its capacity is fixed at construction
(`n`), and once the stack holds `n` elements, pushing a new one causes the **bottom**
element to drop out rather than growing the stack. Verified with a fixed capacity of 5,
pushing a 6th element confirms the oldest element is dropped while the rest of the stack
shifts as expected.

```
cd part2-linked-stack
javac *.java && java Driver
```
<img width="400" alt="image" src="https://github.com/user-attachments/assets/343a2488-2069-4e01-8f0c-c05142a59186" />


## Part 3: Double Ended Queue
Despite the "queue" name, this implements a full **deque**: `enqueueFront`,
`enqueueRear`, `dequeueFront`, `dequeueRear`, plus `first`/`last` accessors. Verified by
enqueueing and dequeueing from both ends and checking `front`/`rear`/`size` after each
operation.

```
cd part3-linked-queue
javac *.java && java Driver
```
<img width="300" alt="image" src="https://github.com/user-attachments/assets/d450e7f2-51a5-4b36-ba14-4c48cf0d0ae7" />
