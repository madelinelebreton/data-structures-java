
/**
 * Assignment 3 question 3
 * Implements a queue using a java.util.LinkedList. Tests all the implemented methods, including error scenarios and 2 data types
 *
 * @author Madeline LeBreton 
 * @version 2025-07-20
 */

public class Driver3
{
    public static void main(String[] args)
    {
        QueueADT<Integer> myQueue = new LinkedListQueue<Integer>(); // create new queue of integers
        
        System.out.println("--------  TESTING LINKED LIST QUEUE   --------");
        
        // test enqueueRear, enqueueFront, and toString methods
        for(int i = 1; i < 6; i++)
        {
            System.out.println("Adding " + i*100 + " to rear");
            myQueue.enqueueRear(i*100);
            
            System.out.println("Adding " + (i+1)*100 + " to front");
            myQueue.enqueueFront((i+1)*100);
            i++;
        }
        System.out.println("\nCurrent queue: \n" + myQueue.toString());

        
        System.out.println("\n\n");

        // test dequeueRear, dequeueFront, first, and last methods
        for(int i = 0; i < 2; i++)
        {
            System.out.println("\nDequeueing rear");
            System.out.println("Removed: " + myQueue.dequeueRear());    
            System.out.println("\nCurrent queue: \n" + myQueue.toString());

            System.out.println("\nDequeueing front");
            System.out.println("Removed: " + myQueue.dequeueFront());
            System.out.println("\nCurrent queue: \n" + myQueue.toString());

        }
        
                
        System.out.println("\n");

        // test isEmpty and size methods on non-empty queue
        if(myQueue.isEmpty() == true)
            System.out.println("The queue is empty. Size: " + myQueue.size());
        else
            System.out.println("The queue is not empty. Size: " + myQueue.size());
        
        System.out.println("\nEmptying the queue...");

        // empty the queue and test again
        System.out.println("\nDequeueing rear");
        System.out.println("Removed: " + myQueue.dequeueRear());    
        System.out.println("\nDequeueing front");
        System.out.println("Removed: " + myQueue.dequeueFront());

        if(myQueue.isEmpty() == true)
            System.out.println("The queue is empty. Size: " + myQueue.size());
        else
            System.out.println("The queue is not empty. Size: " + myQueue.size());
        
        System.out.println("\nTesting dequeue, first, and last methods on empty stack...");

        System.out.println("\nDequeueing rear");
        System.out.println("Removed: " + myQueue.dequeueRear());  
        System.out.println("Dequeueing front");
        System.out.println("Removed: " + myQueue.dequeueFront());  
        System.out.println("First: " + myQueue.first());  
        System.out.println("Last: " + myQueue.last());    
        
        // testing methods with string datatype
        QueueADT<String> myStringQueue = new LinkedListQueue<>(); // create new queue of strings
        System.out.println("\n\nTesting methods with strings... \nEnqueueing 3 names");
        myStringQueue.enqueueRear("David");
        myStringQueue.enqueueFront("Parson");
        myStringQueue.enqueueRear("William");
        System.out.println("\nCurrent queue: \n" + myStringQueue.toString());
        
        System.out.println("\nDequeueing rear");
        System.out.println("Removed: " + myStringQueue.dequeueRear());  
        System.out.println("\nDequeueing front");
        System.out.println("Removed: " + myStringQueue.dequeueFront());  
        System.out.println("\nFirst: " + myStringQueue.first());  
        System.out.println("Last: " + myStringQueue.last()); 
        System.out.println("\nCurrent queue: \n" + myStringQueue.toString());
        


        if(myStringQueue.isEmpty() == true)
            System.out.println("The queue is empty. Size: " + myStringQueue.size());
        else
            System.out.println("The queue is not empty. Size: " + myStringQueue.size());

    }
}