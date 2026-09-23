 

// import jsjf.exceptions.*;
import java.util.Arrays;

/**
 * An array implementation of a stack in which the bottom of the
 * stack is fixed at index 0.
 * 
 * Original code used the top variable to point to the next array position available (above the actual top of the stack)
 * Modified the array implementation such that stack[top] is the actual top of the stack. 
 *
 * @author Java Foundations modified by Madeline LeBreton
 * @version 4.0
 * NOTE: This version contains the implementation of several
 * methods left as a programming exercise.
 */
public class ArrayStack<T> implements StackADT<T>
{
    private final static int DEFAULT_CAPACITY = 100;

    public int top;
    private T[] stack;

    /**
     * Creates an empty stack using the default capacity.
     */
    public ArrayStack()
    {
        this(DEFAULT_CAPACITY);
        top = -1; // initialized to -1 to mean empty
    }

    /**
     * Creates an empty stack using the specified capacity.
     * @param initialCapacity the initial size of the array
     */
    public ArrayStack(int initialCapacity)
    {
        top = -1; // initialized to -1 to mean empty
        stack = (T[])(new Object[initialCapacity]);
    }

    /**
     * Adds the specified element to the top of this stack, expanding
     * the capacity of the array if necessary.
     * @param element generic element to be pushed onto stack
     */
    public void push(T element)
    {
        if (size() == stack.length)
            expandCapacity();

        top++;
        stack[top] = element; // stack[top] is the actual top of the stack
        
    }

    /**
     * Creates a new array to store the contents of this stack with
     * twice the capacity of the old one.
     */
    private void expandCapacity()
    {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    /**
     * Removes the element at the top of this stack and returns a
     * reference to it.
     * @return element removed from top of stack
     * @throws EmptyCollectionException if stack is empty
     */
    public T pop() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("stack");

        T result = stack[top];
        
        if (size() == 1)
            stack[top] = null; // the top of the stack is now empty
        else
            stack[top] = stack[top-1]; // top of the stack moves down one
        
        top--;

        return result;
    }

    /**
     * Returns a reference to the element at the top of this stack.
     * The element is not removed from the stack.
     * @return element on top of stack
     * @throws EmptyCollectionException if stack is empty
     */
    public T peek() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("stack");

        return stack[top];
    }

    /**
     * Returns true if this stack is empty and false otherwise.
     * @return true if this stack is empty
     */
    public boolean isEmpty()
    {
        return (top == -1); // true if empty stack
    }

    /**
     * Returns the number of elements in this stack.
     * @return the number of elements in the stack
     */
    public int size()
    {
        return (top+1); // size is the value of top + 1 (starts at element 0)
    }

    /**
     * Returns a string representation of this stack.
     * @return a string representation of the stack
     */
    public String toString()
    {
        String result = "";

        for (int scan=0; scan <= top; scan++) // stops when it reaches the top
             result = result + stack[scan] + "\n";

        return result;
    }
}

