
/**
 * ArrayListStack is a custom class which implements StackADT
 * Uses method data from https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
 *
 * @author Madeline LeBreton
 * @version 2025-07-20
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStack<T> implements StackADT<T>
{
    private ArrayList<T> stack = new ArrayList();
    
    /**  
     * Adds one element to the top of this stack. 
     * @param element  the element to be added to the rear of the stack  
     */
    public void push(T element)
    {
        stack.addFirst(element); // the addFirst method "appends the specified element to the beginning of this list."
    }
    
    /**  
     * Removes and returns the element at the top of this stack.
     * @return the element at the top of the stack
     */
    public T pop()
    {
        if (stack.isEmpty())
        {
            System.out.println("The stack was already empty!");            
            return null;
        }
        else
            return stack.removeFirst(); // removeFirst method "removes and returns the first element from this list"
    }
    
    /**  
     * Returns without removing the element at the top of this stack.
     * @return the first element in the stack
     */
    public T peek()
    {
        // case of empty stack
        if(stack.size() == 0)
        {
            System.out.println("The stack is already empty!");
            return null;
        }
            
        // returns without removing the element at the top of stack
        return stack.get(0);	// get(int index) returns the element at the specified position in this list   
    }
        
    /**  
     * Returns true if this stack contains no elements.
     * @return true if this stack is empty
     */
    public boolean isEmpty()
    {
        return (stack.size() == 0); // size method "returns the number of elements in this list"
    }

    /**  
     * Returns the number of elements in this stack. 
     * @return the integer representation of the size of the stack
     */
    public int size()
    {
        return stack.size(); // size method "returns the number of elements in this list"
    }

    
    /**  
     * Returns a string representation of this stack. 
     * @return the string representation of the stack
     */
    public String toString()
    {
        String result = ""; // stores a string of all elements in the stack
        for(T element : stack)	// for - in loop iterates through the stack
        {
            result += element + "\n";
        }
        return result;
    }

}