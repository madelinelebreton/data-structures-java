/**
 * Sorting demonstrates sorting and searching on an array 
 * of objects. This code was modified to include a shellSort and bubbleSort2 method
 *
 * @author Java Foundations, modified by Madeline LeBreton
 * @version 4.0 
 */

import java.util.Arrays; // used for array printing
import java.util.Random; // for creating random arrays of integers


public class Sorting 
{
    /**
     * Sorts the specified array of integers using the selection
     * sort algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> 
    void selectionSort(T[] data)
    {
        int min;
        T temp;

        for (int index = 0; index < data.length - 1; index++)
        {
            min = index;
            for (int scan = index + 1; scan < data.length; scan++)
                if (data[scan].compareTo(data[min]) < 0)
                    min = scan;

            swap(data, min, index);
        }
    }

    /**
     * Swaps to elements in an array. Used by various sorting algorithms.
     * 
     * @param data   the array in which the elements are swapped
     * @param index1 the index of the first element to be swapped
     * @param index2 the index of the second element to be swapped
     */
    private static <T extends Comparable<T>> 
    void swap(T[] data, int index1, int index2)
    {
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    /**
     * Sorts the specified array of objects using an insertion
     * sort algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> 
    void insertionSort(T[] data)
    {
        for (int index = 1; index < data.length; index++)
        {
            T key = data[index];
            int position = index;

            // shift larger values to the right 
            while (position > 0 && data[position-1].compareTo(key) > 0)
            {
                data[position] = data[position - 1];
                position--;
            }

            data[position] = key;
        }
    }

    /**
     * Sorts the specified array of objects using a bubble sort
     * algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> 
    void bubbleSort(T[] data)
    {
        int position, scan;
        int pass = 1; // counts number of passes
        int comparisons = 0; // to tally the number of comparisons
        int swaps = 0; // to tally the number of swaps
        long startTime = System.nanoTime(); // record start time of algorithm
        
        // loops through each element pair in the list
        for (position =  data.length - 1; position >= 0; position--)
        {
            // System.out.println("PASS " + (pass++));
            
            // makes pairwise comparisons, swapping the elements if out of order
            for (scan = 0; scan <= position - 1; scan++)
            {
                comparisons++;
                if (data[scan].compareTo(data[scan + 1]) > 0)
                {
                    swaps++; // increment the pass counter
                    swap(data, scan, scan + 1);
                    // System.out.println("swapped " + data[scan] + " and " + data[scan+1] + ": " + Arrays.toString(data)); // print statement
                }
            }
        }
        long totalTime = System.nanoTime() - startTime; // record total execution time
        System.out.println("Final sorted array: " + Arrays.toString(data)); // print final sorted array
        System.out.println("Comparisons: " + comparisons); // print number of comparisons
        System.out.println("Swaps: " + swaps); // print number of swaps
        System.out.printf("Total time: %.4f ms", totalTime / 1000000.0); // print total time
    }
    /**
     * Sorts the specified array of objects using the quick sort algorithm.
     * 
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> 
    void quickSort(T[] data)
    {
        quickSort(data, 0, data.length - 1);
    }

    /**
     * Recursively sorts a range of objects in the specified array using the
     * quick sort algorithm. 
     * 
     * @param data the array to be sorted
     * @param min  the minimum index in the range to be sorted
     * @param max  the maximum index in the range to be sorted
     */
    private static <T extends Comparable<T>> 
    void quickSort(T[] data, int min, int max)
    {
        if (min < max)
        {
            // create partitions
            int indexofpartition = partition(data, min, max);

            // sort the left partition (lower values)
            quickSort(data, min, indexofpartition - 1);

            // sort the right partition (higher values)
            quickSort(data, indexofpartition + 1, max);
        }
    }

    /**
     * Used by the quick sort algorithm to find the partition.
     * 
     * @param data the array to be sorted
     * @param min  the minimum index in the range to be sorted
     * @param max  the maximum index in the range to be sorted
     */
    private static <T extends Comparable<T>> 
    int partition(T[] data, int min, int max)
    {
        T partitionelement;
        int left, right;
        int middle = (min + max) / 2;

        // use the middle data value as the partition element
        partitionelement = data[middle];
        
        // move it out of the way for now
        swap(data, middle, min);

        left = min;
        right = max;

        while (left < right)
        {
            // search for an element that is > the partition element
            while (left < right && data[left].compareTo(partitionelement) <= 0)
                left++;

            // search for an element that is < the partition element
            while (data[right].compareTo(partitionelement) > 0)
                right--;

            // swap the elements
            if (left < right)
                swap(data, left, right);
        }

        // move the partition element into place
        swap(data, min, right);

        return right;
    }
    
    /**
     * Sorts the specified array of objects using the merge sort
     * algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>>
    void mergeSort(T[] data)
    {
        mergeSort(data, 0, data.length - 1);
    }

    /**
     * Recursively sorts a range of objects in the specified array using the
     * merge sort algorithm.
     *
     * @param data the array to be sorted
     * @param min  the index of the first element 
     * @param max  the index of the last element
     */
    private static <T extends Comparable<T>>
    void mergeSort(T[] data, int min, int max)
    {
        if (min < max)
        {
            int mid = (min + max) / 2;
            mergeSort(data, min, mid);
            mergeSort(data, mid + 1, max);
            merge(data, min, mid, max);
        }
    }

    /**
     * Merges two sorted subarrays of the specified array.
     *
     * @param data the array to be sorted
     * @param first the beginning index of the first subarray 
     * @param mid the ending index fo the first subarray
     * @param last the ending index of the second subarray
     */
    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>>
    void merge(T[] data, int first, int mid, int last)
    {
        T[] temp = (T[])(new Comparable[data.length]);

        int first1 = first, last1 = mid;  // endpoints of first subarray
        int first2 = mid + 1, last2 = last;  // endpoints of second subarray
        int index = first1;  // next index open in temp array

        //  Copy smaller item from each subarray into temp until one
        //  of the subarrays is exhausted
        while (first1 <= last1 && first2 <= last2)
        {
            if (data[first1].compareTo(data[first2]) < 0)
            {
                temp[index] = data[first1];
                first1++;
            }
            else
            {
                temp[index] = data[first2];
                first2++;
            }
            index++;
        }

        //  Copy remaining elements from first subarray, if any
        while (first1 <= last1)
        {
            temp[index] = data[first1];
            first1++;
            index++;
        }

        //  Copy remaining elements from second subarray, if any
        while (first2 <= last2)
        {
            temp[index] = data[first2];
            first2++;
            index++;
        }

        //  Copy merged data into original array
        for (index = first; index <= last; index++)
            data[index] = temp[index];
    }

        /**
     * Sorts the specified array of objects using a shell sort
     * algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> 
    void shellSort(T[] data)
    {
        int gap = data.length/2; // integer “gap” across which values are compared
        int comparisons = 0; // to tally the number of comparisons
        int swaps = 0; // to tally the number of swaps
        long startTime = System.nanoTime(); // record start time of algorithm
        
        while (gap > 0) // iterates until last gap size is 1
        {
                boolean swapflag = true; // used to indicate if a swap occurs in a given pass
                
                // passes continue until no swaps occur
                while (swapflag) 
                {
                    swapflag = false;
                
                    for (int s = 0; s + gap < data.length; s++) // iterates through the array to size-gap
                    {
                        // increment comparisons counter, swap if the comparison pair is out of order
                        comparisons++;
                        if (data[s].compareTo(data[s + gap]) > 0) 
                        {    
                            swaps++;
                            swap(data, s, s + gap); // swap the two values using predefined method
                            swapflag = true; // indicate that a swap occurred during this pass
                            
                            // if a swap occurs, the resulting array is printed
                            // System.out.println("swapped " + data[s] + " and " + data[s + gap] + ": " + Arrays.toString(data));

                                    }
                    }
                }
                gap = gap / 2; // gap size cut in half for each subsequent pass
            }
        long totalTime = System.nanoTime() - startTime; // record total execution time
        System.out.println("Final sorted array: " + Arrays.toString(data)); // print final sorted array
        System.out.println("Comparisons: " + comparisons); // print number of comparisons
        System.out.println("Swaps: " + swaps); // print number of swaps
        System.out.printf("Total time: %.4f ms", totalTime / 1000000.0); // print total time
    }
    
       /**
     * Sorts the specified array of objects using a bubble sort
     * algorithm, adapted by Madeline LeBreton to stop when the list is sorted
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> 
    void bubbleSort2(T[] data)
    {
        int pass=1; // pass counter for print statements
        int scan;
        boolean swapflag = true; // indicates when a swap was performed in a pass
        int comparisons = 0; // to tally the number of comparisons
        int swaps = 0; // to tally the number of swaps
        long startTime = System.nanoTime(); // record start time of algorithm
        
        // this loop continutes until no swaps occur in a pass
        while(swapflag)
        {
            swapflag = false; // reset each pass
            // System.out.println("PASS " + pass++); // print and increment counter
            
            // this loop executes to make comparisons between each element in the array
            for (scan = 0; scan < data.length-1; scan++)
            {
                comparisons++; // increment the comparisons counter
                // if the current element is greater than the following element, perform a swap
                if (data[scan].compareTo(data[scan + 1]) > 0)
                {
                    swaps++;
                    swap(data, scan, scan + 1);
                    swapflag = true; // a swap took place in this pass
                    // System.out.println("swapped " + data[scan] + " and " + data[scan+1] + ": " + Arrays.toString(data)); // print statement
                }
            }
        }
        long totalTime = System.nanoTime() - startTime; // record total execution time
        System.out.println("Final sorted array: " + Arrays.toString(data)); // print final sorted array
        System.out.println("Comparisons: " + comparisons); // print number of comparisons
        System.out.println("Swaps: " + swaps); // print number of swaps
        System.out.printf("Total time: %.4f ms", totalTime / 1000000.0); // print total time
    }
}

