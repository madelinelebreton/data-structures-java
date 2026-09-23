 

/**
 * COMP 2231 Assignment 2 part 3
 * LinkedQueue represents a linked implementation of a queue.
 * Adapted to a deque where elements can be accessed from both ends of the queue.
 * 
 * @author Madeline LeBreton adapted from Java Foundations
 * @version 2025-07-13
 */


public class LinkedQueue<T> implements QueueADT<T>
{
    private int count; // keeps track of how many elements are in the dequeue
    private LinearNode<T> head, tail; // front and back of the dequeue

    /**
     * Creates an empty deque.
     */
    public LinkedQueue()
    {
        count = 0;
        head = tail = null;
    }

    /**
     * Adds the specified element to the tail of this deque. Same as the standard enqueue method
     * @param element the element to be added to the tail of the deque
     */
    public void enqueueRear(T element)
    {
        LinearNode<T> node = new LinearNode<T>(element);

        if (isEmpty())
        {
            head = node;
            tail = node;
        }
        
        else
            tail.setNext(node);

        tail = node;
        count++;
    }
    
    /**
     * Adds the specified element to the head of this deque. Adapted from the enqueue method
     * @param element the element to be added to the head of the deque
     */
    public void enqueueFront(T element)
    {
        LinearNode<T> node = new LinearNode<T>(element);
        
        // if the dequeue is empty, the new enqueued element will be the only one 
        if (isEmpty())
        {
            head = node;
            tail = node;
        }
        
        // otherwise, the next link of the enqueued element is set as the head as to not lose the deque, then the head is updated
        else
        {
            node.setNext(head);
            head = node;
        }
        
        count++; // increment the count to represent adding an element
    }

    /**
     * Removes the element at the head of this deque and returns a
     * reference to it. Same as the standard dequeue method
     * @return the element at the head of this queue
     * @throws EmptyCollectionException if the queue is empty
     */
    public T dequeueFront() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("deque");

        T result = head.getElement();
        head = head.getNext();
        count--;

        if (isEmpty())
        {
            tail = null;
            head = null;
        }

        return result;
    }
    
    /**
     * Removes the element at the rear of this deque and returns a
     * reference to it. Adapted from the dequeue method
     * @return the element at the rear of this deque
     * @throws EmptyCollectionException if the deque is empty
     */
    public T dequeueRear() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("deque"); // error if one tries to dequeue from an empty deque

        T result = tail.getElement(); // stores the value to return
        
        // if the last element in the list is dequeued, set the new head and tail to null
        if(count == 1)
        {
            head = null;
            tail = null;
        }
        
        else{
            LinearNode rear = head;
            // traverse the links to find the new tail
            while((rear.getNext()).getNext() != null)
            {
                rear = rear.getNext(); 
            } 
            tail = rear; // update actual tail
            tail.setNext(null); // remove link to last element
        }
        
        // decrement counter to represent removing an element
        count--;        

        return result;
    }

    /**
     * Returns a reference to the element at the head of this deque.
     * The element is not removed from the deque.  
     * @return a reference to the first element in this deque
     * @throws EmptyCollectionsException if the queue is empty
     */
    public T first() throws EmptyCollectionException
    {
        if (head == null)
            throw new EmptyCollectionException("deque");
        
        return head.getElement();  // returns first element in deque
    }

    public T last() throws EmptyCollectionException
    {
        if (tail == null)
            throw new EmptyCollectionException("deque");
        
        return tail.getElement(); // returns last element in deque
    }

    /**
     * Returns true if this deque is empty and false otherwise. 
     * @return true if this deque is empty 
     */
    public boolean isEmpty()
    {
        // true if 0 elements in deque
        return(count == 0);
    }

    /**
     * Returns the number of elements currently in this deque.
     * @return the number of elements in the deque
     */
    public int size()
    {
        // returns count, the number of elements in the deque
        return count;
    }

    /**
     * Returns a string representation of this deque. 
     * @return the string representation of the deque
     */
    public String toString()
    {
        String result = ""; // start with empty string for storage
        LinearNode current = head; // start traversal of deque from the top
        
        // traverse the list, adding each element to the result string, seperated by a newline character
        while(current != null)
        {
            result += current.getElement() + "\n";
            current = current.getNext();
        }
            
        return result;  // returns the final string of elements
    }
}
