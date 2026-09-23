import java.util.*; 

/**
 * Executes tests for ArrayStack methods after modifying them such
 * that stack[top] is the actual top of the stack
 * 
 * Written by Madeline LeBreton
 * 2025-07-12
 * 
 * @param data the array to be sorted
 */


public class Driver
{
    public static void main(String[] args) 
    {
        // testing ArrayStack methods
        System.out.println("\n\n\n\nTesting ArrayStack: \n");
        
        ArrayStack<Integer> stack = new ArrayStack<>(); // new stack

        stack.push(100); // add the number 100 to the top of the stack
        System.out.println("\nStack after pushing '100' (100 expected): " + stack.toString()); // print the stack (100)
        System.out.println("Top (100 expected): " + stack.peek() + "\n"); 
        
        stack.push(200); // add the number 200 to the top of the stack
        stack.push(300); // add the number 300 to the top of the stack
        System.out.println("\nStack after pushing '200' and '300' (100 200 300 expected):\n" + stack.toString()); // print the stack (100 200 300)
        System.out.println("Top (300 expected): " + stack.peek() + "\n");
        
        stack.pop(); // remove the top element from the stack (300)
        System.out.println("\nStack after pop (100 200 expected): \n" + stack.toString()); // print the stack (100 200 -> 300 is removed)
        System.out.println("Top (200 expected): " + stack.peek() + "\n"); 

        System.out.println("\nPeeked value (200 expected): " + stack.peek()); // 200 is the value on top peeked
        System.out.println("Top (200 expected): " + stack.peek() + "\n"); // the stack remains unchanged

        // check if the stack is empty
        System.out.println("\nTesting if the stack is empty...");
        int size = stack.size();
        if(stack.isEmpty()){
            System.out.println("The stack is empty. Size: " + size + "\n");
    
        }
        else{
            System.out.println("The stack is not empty. Size (2 expected): " + size + "\n"); // 2
        }
        
        // remove 100 and 200
        stack.pop(); // remove the top element from the stack
        System.out.println("\nStack after pop (100 expected): " + stack.toString()); // print the  stack (100 -> 200 is removed)
        System.out.println("Top (100 expected): " + stack.peek() + "\n"); 

        stack.pop(); // remove the top element from the stack
        System.out.println("\nPopping the last value from the stack."); 
        
        // check if the stack is empty
        System.out.println("\nTesting if the stack is empty...");
        size = stack.size();
        if(stack.isEmpty())
            System.out.println("The stack is empty. Size (0 expected): " + size + "\n"); 
    
        else
            System.out.println("The stack is not empty. Size: " + size + "\n"); 
        
            
            
            
        
        System.out.println("\n\n\nTesting with random stack of positive and negative numbers, including large values...");

        stack.push(new Random().nextInt(100000 * 2) - 100000); // add random number to the top of the stack
        System.out.println("\nStack after pushing 1 random number: " + stack.toString()); // print the stack
        System.out.println("Top: " + stack.peek() + "\n"); 
        
        int pushes = new Random().nextInt(100);
        int pops = new Random().nextInt(pushes);
        
        for(int i = 0 ; i < pushes; i++)
            stack.push(new Random().nextInt(100000 * 2) - 100000); // add random numbers to the top of the stack
        System.out.println("\nStack after pushing a random number (" + pushes + ") of random numbers:\n" + stack.toString()); // print the stack
        System.out.println("Top: "  + stack.peek() + "\n"); 
        
        for(int i = 0 ; i < pops; i++)
            stack.pop(); // pop a random number of times
        System.out.println("\nStack after popping a random number (" + pops + ") of times:\n" + stack.toString()); // print the stack
        System.out.println("Top: " + stack.peek() + "\n"); 
        
        System.out.println("\nPeeked value: " + stack.peek()); // value on top peeked
        System.out.println("Top: " + stack.peek() + "\n");
        
        // check if the stack is empty
        System.out.println("\nTesting if the stack is empty...");
        int stackSize = stack.size();
        if(stack.isEmpty()){
            System.out.println("The stack is empty. Size (expected " + (pushes - pops + 1) + "): " + stackSize + "\n");
    
        }
        else{
            System.out.println("The stack is not empty. Size (expected " + (pushes - pops + 1) + "): " + stackSize + "\n"); // 2
        }
        
        System.out.println("\nEnd of testing.");
    }
}

