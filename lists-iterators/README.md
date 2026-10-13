# Lists & Iterators

A stack and a double ended queue, each reimplemented twice: once backed by
`java.util.LinkedList`, once by `java.util.ArrayList`. Each is tested for
normal operation, boundary conditions, and behavior on an empty collection.

## Part 1: `LinkedListStack` (`Driver1.java`)
Stack backed by `java.util.LinkedList`. Push/pop verified against expected values;
popping/peeking an empty stack is tested explicitly and returns `null` rather than
throwing.
```
javac *.java && java Driver1
```
<img width="300" alt="image" src="https://github.com/user-attachments/assets/3baf1b49-ffc7-46af-9d72-daff95750154" />

## Part 2: `ArrayListStack` (`Driver2.java`)
Same behavior as Part 1, backed by `java.util.ArrayList` instead.
```
java Driver2
```
<img width="300" alt="image" src="https://github.com/user-attachments/assets/cdf69f0d-ed08-48bc-a158-efa770bf0e25" />

## Part 3: `LinkedListQueue` (`Driver3.java`)
A double-ended queue backed by `java.util.LinkedList`: `enqueueFront`, `enqueueRear`,
`dequeueFront`, `dequeueRear`, `first`, `last`. Tested on both integers and strings,
including dequeueing from an empty queue.
```
java Driver3
```
<img width="227" alt="image" src="https://github.com/user-attachments/assets/5a36b35c-6d84-4d0a-9800-cc6da3a53748" />


## Part 4: `ArrayListQueue` (`Driver4.java`)
Same double-ended behavior as Part 3, backed by `java.util.ArrayList`.
```
java Driver4
```
<img width="100" alt="image" src="https://github.com/user-attachments/assets/2164c5f6-4f58-4852-bac7-b1fd4faaa44e" />

