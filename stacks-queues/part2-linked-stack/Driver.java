
/**
 * Creates a stack of moderate size (5) and pushes that many string elements consisting of people’s names 
 * (include my own). Outputs contents of the stack and results of size() and peek() operations. Pushes two 
 * more elements onto the stack, outputting the contents and results of the size() and peek() operations for each.


 * @author Madeline LeBreton
 * @version 2025-07-12
 */
public class Driver
{
    public static void main(String[] args) 
    {
        // create a new LinkedStack called dropoutStack to hold strings
        LinkedStack<String> dropoutStack = new LinkedStack<>(5);
        
        // push the 5 names onto the stack
        String[] names = {"Andy", "Charles", "Daniel", "Madeline", "Nancy"};
        for (int i=0; i<5; i++){
            dropoutStack.push(names[i]);
        }
        
        // output the contents of the stack and the results of the size() and peek() operations
        System.out.println("Stack after pushing 5 names:\n" + dropoutStack.toString());
        System.out.println("Size: " + dropoutStack.size());
        System.out.println("Peek at top of stack: " + dropoutStack.peek());

        // push two more elements onto the stack, output stack contents and results of size() and peek()
        dropoutStack.push("William");
        dropoutStack.push("Yasmin");
        
        System.out.println("\n\nStack after pushing William and Yasmin:\n" + dropoutStack.toString());
        
        System.out.println("Size: " + dropoutStack.size());
        System.out.println("Peek at top of stack: " + dropoutStack.peek());
        
        // check to make sure Charles dropped out -> throws error so I know it works properly
        LinearNode temp = dropoutStack.top;
        System.out.println("\n\n\n\nChecking to make sure the bottom of the stack dropped out: ");

        for (int i = 0; i<5; i++)
            {
                System.out.println("Current item: " + temp.getElement() + " at element " + i + "        Next address: " + temp.getNext());
                temp = temp.getNext();
            }


    }
}