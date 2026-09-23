/**
 * LinkedListQueue is a custom class which implements QueueADT from the textbook using java.util.LinkedList.
 *
 * Uses method information from https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html 
 * @author Madeline LeBreton
 * @version 2025-07-20
 */

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListQueue<T> implements QueueADT<T>
{
    private LinkedList<T> queue = new LinkedList();
    /**  
     * Adds one element to the rear of this queue. 
     * @param element  the element to be added to the rear of the queue  
     */
    public void enqueueRear(T element)
    {
        queue.addLast(element); // the addLast method "appends the specified element to the end of this list."
    }
    
    /**  
     * Adds one element to the front of this queue. 
     * @param element  the element to be added to the front of the queue  
     */
    public void enqueueFront(T element)
    {
        queue.addFirst(element); // the addFirst method "inserts the specified element at the beginning of this list"
    }

    /**  
     * Removes and returns the element at the front of this queue.
     * @return the element at the front of the queue
     */
    public T dequeueFront()
    {
        if (queue.isEmpty())
        {
            System.out.println("The queue was already empty!");            
            return null;
        }
        else
            return queue.removeFirst(); // removeFirst method "removes and returns the first element from this list"
    }
    
    /**  
     * Removes and returns the element at the rear of this queue.
     * @return the element at the rear of the queue
     */
    public T dequeueRear()
    {
        if (queue.isEmpty())
        {
            System.out.println("The queue was already empty!");
            return null;
        }
        else
            return queue.removeLast(); // removeLast method "removes and returns the last element from this list"
    }

    /**  
     * Returns without removing the element at the front of this queue.
     * @return the first element in the queue
     */
    public T first()
    {
        return queue.peekFirst(); // the peekFirst method "retrieves, but does not remove, the first element of this list, or returns null if empty"
    }

     /**  
     * Returns without removing the element at the rear of this queue.
     * @return the first element in the queue
     */
    public T last()
    {
        return queue.peekLast(); // peekLast method "retrieves, but does not remove, the last element of this list, or returns null if empty"
    }

    /**  
     * Returns true if this queue contains no elements.
     * @return true if this queue is empty
     */
    public boolean isEmpty()
    {
        return (queue.size() == 0); // size method "returns the number of elements in this list"
    }

    /**  
     * Returns the number of elements in this queue. 
     * @return the integer representation of the size of the queue
     */
    public int size()
    {
        return queue.size(); // size method "returns the number of elements in this list"
    }

    /**  
     * Returns a string representation of this queue. 
     * @return the string representation of the queue
     */
    public String toString()
    {
        String result = ""; // stores a string of all elements in the queue
        for(T element : queue)	// for - in loop iterates through the queue
        {
            result += element + "\n";
        }
        return result;
    }

}