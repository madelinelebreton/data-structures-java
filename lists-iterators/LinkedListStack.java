
/**
 * LinkedListStack is a custom class which implements StackADT
 * Uses method data from https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html
 *
 * @author Madeline LeBreton
 * @version 2025-07-20
 */

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListStack<T> implements StackADT<T>
{
    private LinkedList<T> stack = new LinkedList();
    
    public void push(T element)
    {
        // adds the specified element to the top of this stack
        stack.add(0, element); // 	add(int index, E element) inserts the specified element at the specified position in this list.
    }

    public T pop()
    {
        // handles empty stack scenario
        if(stack.size() == 0)
        {
            System.out.println("The stack is already empty!");
            return null;
        }
        // removes and returns the top element from this stack
        return stack.remove(); // 	remove() retrieves and removes the head (first element) of this list
    }

    public T peek()
    {
        // returns without removing the top element of this stack
        return stack.peek(); // peek() retrieves, but does not remove, the head (first element) of this list
    }


    public boolean isEmpty()
    {
        // returns true if this stack contains no elements
        return(stack.size() == 0);
    }

    /** 
     * Returns the number of elements in this stack. 
     * @return the number of elements in the stack
     */
    public int size()
    {
        return stack.size(); // size() returns the number of elements in this list.
    }

    public String toString()
    {
        String result = ""; // creates empty string to store result
    
        // returns a string representation of this stack using a for-in iteration loop
        for(T element : stack)
            result += element + "\n";
        return result;
    }
}