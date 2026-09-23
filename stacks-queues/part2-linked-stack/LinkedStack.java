 

//import exceptions.*;
import java.util.Iterator;

/**
 * Implements a drop-out stack using links. Behaves like a stack except that the size is fixed to n=5. 
 * If the stack size is n, the bottom element is lost when the n+1 element is pushed onto the top. 
 *
 * @author Madeline LeBreton adapted from Java Foundations
 * 2025-07-12
 * @version 4.0
 */
public class LinkedStack<T> implements StackADT<T>
{
    public int size; // fixed size of the stack
    public int count; // for keeping track of how many elements are in the stack
    public LinearNode<T> top; // top element in the stack

    /**
     * Creates an empty stack.
     */
    public LinkedStack(int n)
    {
        size = n;
        count = 0;
        top = null;
    }

    /**
     * Adds the specified element to the top of this stack.
     * @param element element to be pushed on stack
     */
    public void push(T element)
    {
        LinearNode<T> temp = new LinearNode<T>(element);

        // the element to be pushed is added to the top of the stack
        temp.setNext(top);
        top = temp;
        
        count ++; // increment the counter
        
        // if there are 6 elements in the stack, the bottom element must drop out
        if(count > size){
            LinearNode<T> bottom = top.getNext();

            for (int i = 0; i<3; i++)
            {
                bottom = bottom.getNext();
            }
            bottom.setNext(null); // remove link to last item
            
            count --; // keep track of drop out
        }        
    }



    /**
     * Removes the element at the top of this stack and returns a
     * reference to it.
     * @return element from top of stack
     * @throws EmptyCollectionException if the stack is empty
     */
    public T pop() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("stack");  

        T result = top.getElement();
        top = top.getNext();
        count--;

        return result;
    }

    /**
     * Returns a reference to the element at the top of this stack.
     * The element is not removed from the stack.
     * @return element on top of stack
     * @throws EmptyCollectionException if the stack is empty
     */
    public T peek() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("stack");

        return top.getElement();
    }

    /**
     * Returns true if this stack is empty and false otherwise.
     * @return true if stack is empty
     */
    public boolean isEmpty()
    {
        return (count == 0);
    }

    /**
     * Returns the number of elements in this stack.
     * @return number of elements in the stack
     */
    public int size()
    {
        return count;
    }

    /**
     * Returns a string representation of this stack.
     * @return string representation of the stack
     */
    public String toString()
    {
        String result = "";
        LinearNode current = top;

        while (current != null)
        {
            result = result + current.getElement() + "\n";
            current = current.getNext();
        }

        return result;
    }
}
