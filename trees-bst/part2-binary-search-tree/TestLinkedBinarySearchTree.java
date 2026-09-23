/* 
 * Assignment 4 Part 2
 * Test cases for LinkedBinarySearchTree
 * COMP 2231
 * Written by Madeline LeBreton
 * Date: 28/08/2025
 */


import java.io.*;
import jsjf.*;
import jsjf.exceptions.*;

public class TestLinkedBinarySearchTree
{
    // Runs test cases for LinkedBinarySearchTree

    public static void main(String[] args) throws FileNotFoundException 
    {
        System.out.println("Creating new LinkedBinarySearchTree for testing...");
        LinkedBinarySearchTree<Integer> testTree = new LinkedBinarySearchTree<>(); // create new LinkedBinarySearchTree to perform tests on

        System.out.println("Adding integers 8, 12, and 2 to the tree using addElement() method...");
        testTree.addElement(8); // add an integer to the tree
        testTree.addElement(12); // add an integer to the tree
        testTree.addElement(2); // add an integer to the tree
        
        System.out.println("Current tree: ");
        testTree.toString(); // print the tree
        
        System.out.println("\nTesting contains() method...");
        if(testTree.contains(16)){ // check if tree contains 16
            System.out.println("Found the target element: 16");
        } 

        if(testTree.contains(16)){ // check if tree contains 16
            System.out.println("Found the target element in the tree: 16");
        } 
        
        System.out.println("\nTesting removeElement() method...");
        testTree.removeElement(16); // remove element with value 16

        if(testTree.contains(16)){ // verify that 16 has been removed
            System.out.println("\n16 has been removed from the tree");
        }

        

        



    }
}


