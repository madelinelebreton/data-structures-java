/**
 * For making arrays of random integers, used in Driver
 * 
 * Written by Madeline LeBreton
 * 
 * @param data the array to be sorted
 */
import java.util.Arrays; // for array printing
import java.util.Random; // for creating random arrays of integers

public class Utilities{
    /**
     * @param size is the number of integers in the array
     * @param bound is the upper and lower (-bound to +bound) bound for random number generation
     */
    
    public static Integer[] generateRandomArray(int size, int bound) { // returns an unsorted array of random numbers
        Random rand = new Random(); // creates object to generate random numbers
        Integer[] array = new Integer[size]; // initialize integer array of the given size
        for (int i = 0; i < size; i++) 
        {
            array[i] = rand.nextInt(bound * 2) - bound; // generate random number within +/- bound for each element in the array
        }
        return array;
    }
    
    public static Integer[] generateSortedArray(int size, int bound) { // returns a sorted array of random numbers
        Random rand = new Random(); // creates object to generate random numbers
        Integer[] array = new Integer[size]; // initialize integer array of the given size
        array[0] = rand.nextInt(bound * 2) - bound; // generate random number within +/- bound for first element in the array
        for (int i = 1; i < size; i++) 
        {
            array[i] = rand.nextInt(bound * 2) - bound; // generate random number within +/- bound for each element in the array
    
            while(array[i] < array [i-1]){
                array[i] = rand.nextInt(bound * 2) - bound; // make sure the new element is ordered
            }
        }
        return array;
    }
}

