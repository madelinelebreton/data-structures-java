
/**
 * Creates a deque of size 6. Repetitively adds elements to the front, and then the rear. 
 * For each addition, outputs the contents and size, front element, and last element. 
 * Then, repetitively removes elements, outputting contents and size, front element, and last element. 
 *
 * @author Madeline LeBreton
 * @version 2025-07-13
 */


public class Driver 
{
    public static void main(String[] args){
     QueueADT<Integer> deque = new LinkedQueue<>();
     
     // repetitively adds a total of 6 elements to the front and the rear
     // for each, outputs the contents and size, front element, and last element
     int toAdd = 100;
     
     for(int i=0; i<3; i++)
     {
         System.out.println("\nEnqueued to front: " + toAdd);
         deque.enqueueFront(toAdd);
         System.out.println("Contents: \n" + deque.toString() + "Size: " + deque.size() + "  Front: " + deque.first() + "  Rear: " + deque.last());
         toAdd += 100;
         System.out.println("\nEnqueued to rear: " + toAdd);
         deque.enqueueRear(toAdd);
         System.out.println("Contents: \n" + deque.toString() + "Size: " + deque.size() + "  Front: " + deque.first() + "  Rear: " + deque.last());
         toAdd += 100;
     }

     System.out.println("\n"); // for clarity of formatting
     
     // repetitively removes elements, outputting contents and size, front element, and last element
     for(int i=0; i<2; i++){
         System.out.println("\nDequeued from front: " + deque.dequeueFront());
         System.out.println("Contents: \n" + deque.toString() + "Size: " + deque.size() + "  Front: " + deque.first() + "  Rear: " + deque.last());
         System.out.println("\nDequeued from rear: " + deque.dequeueRear());
         System.out.println("Contents: \n" + deque.toString() + "Size: " + deque.size() + "  Front: " + deque.first() + "  Rear: " + deque.last());
     }
     System.out.println("\nDequeued from front: " + deque.dequeueFront());
     System.out.println("Contents: \n" + deque.toString() + "Size: " + deque.size() + "  Front: " + deque.first() + "  Rear: " + deque.last());
     System.out.println("\nDequeued from rear: " + deque.dequeueRear());
     System.out.println("The deque is now empty. \nSize: " + deque.size());
    }
}