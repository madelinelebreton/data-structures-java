import jsjf.ArrayHeap;

/**
 * HeapSort sorts a given array of Comparable objects using a heap.
 * 
 * Made more efficient by writing a method that will build a heap 
 * in place using the array to be sorted
 * 
 * @author Java Foundations modified by Madeline LeBreton
 * @version 4.0
 */
public class HeapSort<T extends Comparable <T>>
{
	/**
	 * Sorts the specified array using a Heap. For minheap, every parent <= its children
	 *
	 * @param data the data to be added to the heapsort
	 */
	public void heapSort(T[] data) 
	{
		int n = data.length; // size of input array

		// build a heap in place
		buildHeap(data);

		// extract elements one at a time from the end, sorting as we go
		// on each element, make sure the minheap property is held
		for(int i = n-1; i>=0; i--)
		{
			// move current smallest item to the end
			swap(data, 0, i);

			// call heapify on reduced heap
			heapify(data, i, 0);
		}
	}

	/* 
	* Makes HeapSort more efficient by creating the heap in place (turns the given array into a min heap)
	* Heapify everything from the bottom up to make sure the root is the smallest
	*/

	private void buildHeap(T[] data)
	{
		int n = data.length; 

		// starting at last non-leaf node (nodes n/2 to n-1 are leaves), heapify each
		for(int i= (n/2 - 1); i>=0; i--)
		{
			heapify(data, n, i);
		}
	}

	/*
	* Ensures minheap requirements satisfied for heap rooted at i
	*/

	public void heapify(T[] data, int n, int i)
	{
		// given the mathematical relationships between nodes and children
		int smallest = i;
		int left = 2*i + 1; 
		int right = 2*i + 2;

		// check left child
		if(left < n && data[left].compareTo(data[smallest]) < 0){
			smallest = left; // keep track of smallest element
		}

		// check right child
		if(right < n && data[right].compareTo(data[smallest]) < 0)
		{
			smallest = right; // keep track of smallest element
		}

		// if the root is not the smallest, swap and recurse
		if( smallest != i)
		{
			swap(data, i, smallest); // swap the element at i with the smallest element to fix the order
			heapify(data, n, smallest); // recursively ensure min property still holds with heap rooted at new smallest
		}
	}

	// private helper function to swap two array elements at indices i and j
	private void swap(T[] data, int i, int j)
	{
		T temp = data[i]; // store the element at i, as not to lose it
		data[i] = data[j]; // move the element at j to index i
		data[j] = temp; // put the stored element that was at i to j
	}
}

