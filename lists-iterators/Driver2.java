
/**
 * Assignment 3 question 2
 * Implements a stack using a java.util.ArrayList. Tests all the implemented methods, including error scenarios and 2 data types
 *
 * @author Madeline LeBreton
 * @version 2025-07-20
 */

public class Driver2
{
    public static void main(String[] args)
    {
        StackADT<Integer> myStack = new ArrayListStack<Integer>(); // create new stack of integers
        
        System.out.println("--------  TESTING ARRAY LIST STACK   --------");
        
        // test push and toString methods
        for(int i = 1; i < 6; i++)
        {
            System.out.println("Pushing " + i*100);
            myStack.push(i*100);
        }
        System.out.println("\nCurrent stack: \n" + myStack.toString());

        
        System.out.println("\n\n");

        // test pop, first, and last methods
        for(int i = 0; i < 4; i++)
        {
            System.out.println("\nPopping");
            System.out.println("Removed: " + myStack.pop());    
            System.out.println("\nCurrent stack: \n" + myStack.toString());
        }
        
                
        System.out.println("\n");

        // test isEmpty and size methods on non-empty queue
        if(myStack.isEmpty() == true)
            System.out.println("The stack is empty. Size: " + myStack.size());
        else
            System.out.println("The stack is not empty. Size: " + myStack.size());
        
        System.out.println("\nEmptying the stack...");

        // empty the queue and test again
        System.out.println("Removed: " + myStack.pop());    

        if(myStack.isEmpty() == true)
            System.out.println("The stack is empty. Size: " + myStack.size());
        else
            System.out.println("The stack is not empty. Size: " + myStack.size());
        
        System.out.println("\nTesting pop and peek methods on empty stack...");

        System.out.println("\nPopping...");
        System.out.println("Removed: " + myStack.pop());   
        System.out.println("Peek: " + myStack.peek());  
        
        // testing methods with string datatype
        StackADT<String> myStringStack = new LinkedListStack<>(); // create new queue of strings
        System.out.println("\n\nTesting methods with strings... \nPushing 3 names");
        myStringStack.push("David");
        myStringStack.push("Parson");
        myStringStack.push("William");
        System.out.println("\nCurrent stack: \n" + myStringStack.toString());
        
        System.out.println("\nPopping twice...");
        System.out.println("Removed: " + myStringStack.pop());  
        System.out.println("Removed: " + myStringStack.pop());  
        System.out.println("\nPeek: " + myStringStack.peek());  
        System.out.println("\nCurrent stack: \n" + myStringStack.toString());
        


        if(myStringStack.isEmpty() == true)
            System.out.println("The stack is empty. Size: " + myStringStack.size());
        else
            System.out.println("The stack is not empty. Size: " + myStringStack.size());

    }
}