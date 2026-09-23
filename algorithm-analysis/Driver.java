/**
 * Individually tests the shellSort method. Executes 6 sets of tests for the bubbleSort, 
 * bubbleSort2, and shellSort algorithms based on different sizes of sorted and unsorted arrays
 * 
 * Written by Madeline LeBreton
 * 
 * @param data the array to be sorted
 */

import java.util.Arrays; // for array printing
import java.util.Random; // for creating random arrays of integers

public class Driver
{
    public static void main(String[] args) 
    {
        System.out.println("\n\n-------------- NEW TESTS ------------- \n");
/* shellsort is now tested with the bubbleSort and bubbleSort2 test cases
        // testing shellSort
        System.out.println("Testing shellSort: \n");
        
        Integer[] exampleArray = {9, 6, 8, 12, 3, 1, 7}; // predefined example to sort
        System.out.println("Original data for exampleArray: " + Arrays.toString(exampleArray)); // print the original data
        Sorting.shellSort(exampleArray); // run the sorting algorithm
        
    
        // testing unsorted arrays of size 10, 100, 1000 
        Integer[] randArray10 = Utilities.generateRandomArray(10, 1000000); // array of 10 random integers to sort
        System.out.println("\n\n\nOriginal data for randArray10: " + Arrays.toString(randArray10)); // print the original data
        Sorting.shellSort(randArray10); // run the sorting algorithm
        
        Integer[] randArray100 = Utilities.generateRandomArray(100, 1000000); // 100 random integers
        System.out.println("\n\n\nOriginal data for randArray100: " + Arrays.toString(randArray100)); // print unsorted data
        Sorting.shellSort(randArray100); // run the sorting algorithm
        
        Integer[] randArray1000 = Utilities.generateRandomArray(1000, 1000000); // 100 random integers
        System.out.println("\n\n\nOriginal data for randArray1000: " + Arrays.toString(randArray1000)); // print unsorted data
        Sorting.shellSort(randArray1000); // run the sorting algorithm
        
        
        // testing sorted arrays of size 10, 100, 1000 
        Integer[] randArray10b = Utilities.generateSortedArray(10, 1000000); // array of 10 random integers to sort
        System.out.println("\n\n\nOriginal data for randArray10 sorted: " + Arrays.toString(randArray10b)); // print the original data
        Sorting.shellSort(randArray10b); // run the sorting algorithm
        
        Integer[] randArray100b = Utilities.generateSortedArray(100, 1000000); // 100 random integers
        System.out.println("\n\n\nOriginal data for randArray100 sorted: " + Arrays.toString(randArray100b)); // print unsorted data
        Sorting.shellSort(randArray100b); // run the sorting algorithm
        
        Integer[] randArray1000b = Utilities.generateSortedArray(1000, 1000000); // 100 random integers
        System.out.println("\n\n\nOriginal data for randArray1000 sorted: " + Arrays.toString(randArray1000b)); // print unsorted data
        Sorting.shellSort(randArray1000b); // run the sorting algorithm

 */               
                
        // testing on size 10, unsorted and sorted
        System.out.println("\n\n\nTesting shellSort, bubbleSort and bubbleSort2:\n");
        
        Integer[] rand10 = Utilities.generateRandomArray(10, 1000000); // array of 10 random integers
        System.out.println("\n\n\nOriginal data for rand10: " + Arrays.toString(rand10) + "\n\nbubbleSort:"); // print original array
        Sorting.bubbleSort(Arrays.copyOf(rand10,10)); // sort identical copy of list
        System.out.println("\n\nbubbleSort2: ");
        Sorting.bubbleSort2(Arrays.copyOf(rand10, 10)); // sort identical copy of list using bubbleSort2
        System.out.println("\n\nshellSort: ");
        Sorting.shellSort(Arrays.copyOf(rand10, 10)); // sort identical copy of list using shellSort
        
        Integer[] ordered10 = Utilities.generateSortedArray(10, 1000000); 
        System.out.println("\n\n\nOriginal data for ordered10: " + Arrays.toString(ordered10) + "\n\nbubbleSort:"); // print original array
        Sorting.bubbleSort(Arrays.copyOf(ordered10, 10)); // sort using bubbleSort
        System.out.println("\n\nbubbleSort2:");
        Sorting.bubbleSort2(Arrays.copyOf(ordered10, 10)); // sort using bubbleSort2
        System.out.println("\n\nshellSort: ");
        Sorting.shellSort(Arrays.copyOf(ordered10, 10)); // sort identical copy of list using shellSort
        
        // testing bubbleSort and bubbleSort2 on size 100, unsorted and sorted
        Integer[] rand100 = Utilities.generateRandomArray(100, 1000000); // array of 10 random integers
        System.out.println("\n\n\nOriginal data for rand100: " + Arrays.toString(rand100) + "\n\nbubbleSort:"); // print original array
        Sorting.bubbleSort(Arrays.copyOf(rand100, 100)); // sort identical copy of list
        System.out.println("\n\nbubbleSort2: ");
        Sorting.bubbleSort2(Arrays.copyOf(rand100, 100)); // sort identical copy of list using bubbleSort2
        System.out.println("\n\nshellSort: ");
        Sorting.shellSort(Arrays.copyOf(rand100, 100)); // sort identical copy of list using shellSort
        
        Integer[] ordered100 = Utilities.generateSortedArray(100, 1000000);
        System.out.println("\n\n\nOriginal data for ordered100: " + Arrays.toString(ordered100) + "\n\nbubbleSort:"); // print original array
        Sorting.bubbleSort(Arrays.copyOf(ordered100, 100)); // sort using bubbleSort
        System.out.println("\n\nbubbleSort2:");
        Sorting.bubbleSort2(Arrays.copyOf(ordered100, 100)); // sort using bubbleSort2
        System.out.println("\n\nshellSort: ");
        Sorting.shellSort(Arrays.copyOf(ordered100, 100)); // sort identical copy of list using shellSort
        
        // testing on size 1000, unsorted and sorted
        Integer[] rand1000 = Utilities.generateRandomArray(1000, 1000000); // array of 10 random integers
        System.out.println("\n\n\nOriginal data for rand1000: " + Arrays.toString(rand10) + "\n\nbubbleSort:"); // print original array
        Sorting.bubbleSort(Arrays.copyOf(rand1000,1000)); // sort identical copy of list
        System.out.println("\n\nbubbleSort2: ");
        Sorting.bubbleSort2(Arrays.copyOf(rand1000, 1000)); // sort identical copy of list using bubbleSort2
        System.out.println("\n\nshellSort: ");
        Sorting.shellSort(Arrays.copyOf(rand1000, 1000)); // sort identical copy of list using shellSort
        
        Integer[] ordered1000 = Utilities.generateSortedArray(1000, 1000000);
        System.out.println("\n\n\nOriginal data for ordered1000: " + Arrays.toString(ordered1000) + "\n\nbubbleSort:"); // print original array
        Sorting.bubbleSort(Arrays.copyOf(ordered1000, 1000)); // sort using bubbleSort
        System.out.println("\n\nbubbleSort2:");
        Sorting.bubbleSort2(Arrays.copyOf(ordered1000, 1000)); // sort using bubbleSort2
        System.out.println("\n\nshellSort: ");
        Sorting.shellSort(Arrays.copyOf(ordered1000, 1000)); // sort identical copy of list using shellSort
        
        
        
        
        
        
        System.out.println("\nOther test cases:");
        
        System.out.println("\n\nEmpty array:");
        System.out.println("\nshellSort:");
        Sorting.shellSort(new Integer[0]);
        System.out.println("\nbubbleSort:");
        Sorting.bubbleSort(new Integer[0]); 
        System.out.println("\nbubbleSort2:");
        Sorting.bubbleSort2(new Integer[0]);
        
        System.out.println("\n\nOne element:");
        System.out.println("\nshellSort:");
        Sorting.shellSort(new Integer[]{49});
        System.out.println("\nbubbleSort:");
        Sorting.bubbleSort(new Integer[]{49});
        System.out.println("\nbubbleSort2:");
        Sorting.bubbleSort2(new Integer[]{49});
        
        System.out.println("\n\nReverse array:");
        System.out.println("\nshellSort:");
        Sorting.shellSort(new Integer[] {2310, 2301, 402, 123, 20, 12, 10, 9, 4, 0, -1, -10, -44, -256, -999});
        System.out.println("\nbubbleSort:");
        Sorting.bubbleSort(new Integer[] {2310, 2301, 402, 123, 20, 12, 10, 9, 4, 0, -1, -10, -44, -256, -999});
        System.out.println("\nbubbleSort2:");
        Sorting.bubbleSort2(new Integer[] {2310, 2301, 402, 123, 20, 12, 10, 9, 4, 0, -1, -10, -44, -256, -999});
        
        System.out.println("\n\nArray with duplicates:");
        System.out.println("\nshellSort:");
        Sorting.shellSort(new Integer[] {23, 23, 4, 123, 20, 12, 23, 9, 23, -23, 10, -44, 23, -256, 23, 999});
        System.out.println("\nbubbleSort:");
        Sorting.bubbleSort(new Integer[] {23, 23, 4, 123, 20, 12, 23, 9, 23, -23, 10, -44, 23, -256, 23, 999});
        System.out.println("\nbubbleSort2:");
        Sorting.bubbleSort2(new Integer[] {23, 23, 4, 123, 20, 12, 23, 9, 23, -23, 10, -44, 23, -256, 23, 999});

    }
}

