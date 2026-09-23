import jsjf.*;

public class TestHeapSort{
    public static void main(String[] args)
    {
        HeapSort<Integer> heapSorter = new HeapSort<>(); // build new sorter


        Integer[] test1 = {9023, 1029, 984, 783, 645, 234, 222, 102, 92, 37, 22, 12, 9, 6, 3, 0}; // sorted list to test
        System.out.println("\n\nTest case 1: " + ArrayList.toString(test1) + " (in order)");
        
        heapSorter.heapSort(test1);
        System.out.println("Results after heapSort: " + ArrayList.toString(test1));


        Integer[] test2 = {34, 56, 67, 2, 3, 7, 123, 45, 85, 434, 2345, 45, 765, 5, 0}; // random list to test
        System.out.println("\n\nTest case 2: " + ArrayList.toString(test2) + " (random)");
        
        heapSorter.heapSort(test2);
        System.out.println("Results after heapSort: " + ArrayList.toString(test2));



        Integer[] test3 = {1, 3, 5, 7, 9, 12}; // reverse list to test
        System.out.println("\n\nTest case 3: " + ArrayList.toString(test3) + " (reverse order)");
        
        heapSorter.heapSort(test3);
        System.out.println("Results after heapSort: " + ArrayList.toString(test3));

        
        Integer[] test4 = {33, 56, 7, 91, 7, 3, 4, 7, 0, 1, 3, 0, 7, 0, 4}; // list with duplicates
        System.out.println("\n\nTest case 4: " + ArrayList.toString(test4) + " (with duplicated)");
        
        heapSorter.heapSort(test4);
        System.out.println("Results after heapSort: " + ArrayList.toString(test4));


        Integer[] test5 = {35}; // list with duplicates
        System.out.println("\n\nTest case 5: " + ArrayList.toString(test5) + " (single element)");
        
        heapSorter.heapSort(test5);
        System.out.println("Results after heapSort: " + ArrayList.toString(test5));


        Integer[] test6 = {}; // list with duplicates
        System.out.println("\n\nTest case 6: " + ArrayList.toString(test6) + " (empty list)");
        
        heapSorter.heapSort(test6);
        System.out.println("Results after heapSort: " + ArrayList.toString(test6));


    }
}