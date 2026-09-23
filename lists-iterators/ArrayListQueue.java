
/**
 * ArrayListQueue implements ArrayList with QueueADT
 * Uses method information from https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
 *
 * @author Madeline LeBreton
 * @version 2025-07-20
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListQueue<T> implements QueueADT<T>
{
    private ArrayList<T> queue = new ArrayList();
    
    public void enqueueRear(T element)
    {
        // adds one element to the rear of this queue
        queue.add(queue.size(), element);	// inserts the specified element at the specified position in this queue, [size] is the last index
    }
    
    public void enqueueFront(T element)
    {
        // adds one element to the front of this queue
        queue.add(0, element); // inserts element at index 0, the front of the queue
    }

    public T dequeueFront()
    {
        // error handling if the list is empty
        if(queue.size() == 0)
        {
            System.out.println("The queue was already empty!");
            return null;
        }
        // removes and returns the element at the front of this queue
        return queue.remove(0) ; // remove(int index) removes the element at the specified position in this queue
    }
    
    public T dequeueRear()
    {
        // error handling if the list is empty
        if(queue.size() == 0)
        {
            System.out.println("The queue was already empty!");
            return null;
        }
        // removes and returns the element at the rear of this queue
        return queue.remove(queue.size()-1) ; // remove(int index) removes the element at the specified position in this queue
    
    }

    public T first()
    {
        // case of empty queue
        if(queue.size() == 0)
        {
            System.out.println("The queue is already empty!");
            return null;
        }
            
        // returns without removing the element at the front of this queue
        return queue.get(0);	// get(int index) returns the element at the specified position in this queue
    }

    public T last()
    {
        // case of empty queue
        if(queue.size() == 0)
        {
            System.out.println("The queue is already empty!");
            return null;
        }
        // returns without removing the element at the rear of this queue
        return queue.get(queue.size()-1);	// get(int index) returns the element at the specified position in this queue
    }

    public boolean isEmpty()
    {
        return(queue.size() == 0); // returns true if this queue contains 0 elements
    }

    public int size()
    {
        return queue.size(); // returns the number of elements in this queue
    }

    public String toString()
    {
        String result = ""; // will store resulting string to return
        // iterates through the queue using for-each loop, returns a string representation
        for (T element : queue) // returns list containing all elements in proper sequence (from first to last)
            result += (element + "\n");
        return result;
    }
}