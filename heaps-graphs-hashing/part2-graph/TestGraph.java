import jsjf.Graph;

import java.util.Iterator;
import java.util.Arrays;

/*
* TestGraph.java
* Author: Madeline LeBreton
* Date: 04/09/2025
* Tests the implementation of Graph.java methods with edge cases
*/

public class TestGraph {

    public static void main(String args[]) {
        // testing addVertex and size methods
        System.out.println("\nTesting addVertex and size methods");
        Graph<String> g = new Graph<>();

        if(g.isEmpty())
            System.out.println("\nCreated a new empty graph. Size: " + g.size());

        System.out.println("Adding A, B, and C as vertices...");
        g.addVertex("A");
        g.addVertex("B");
        g.addVertex("C");

        System.out.println("\nNew size (3 expected): " + g.size());

        System.out.println("\nVertices: " + Arrays.toString(g.getVertices()));

        // testing with empty argument
        System.out.println("\nTesting addVertex() with empty string...");
        g.addVertex("");
        System.out.println("\nSize (4 expected): " + g.size());

        System.out.println("\nVertices: " + Arrays.toString(g.getVertices()));
        System.out.println("Removing empty vertex.");
        g.removeVertex(3);
        System.out.println("Vertices: " + Arrays.toString(g.getVertices()));

        // test addEdge and removeEdge
        System.out.println("\nTesting addEdge and removeEdge methods");

        System.out.println("Adding edge between A and B");
        g.addEdge("A", "B");

        System.out.println("Adding edge between B and C"); // the graph is now connected because a path exists between each vertex
        g.addEdge("B", "C");

        System.out.println("Is the graph connected? (expect true): " + g.isConnected()); // true if two vertices linked
        
        System.out.println("Removing edge between A and B");
        g.removeEdge("A", "B");
        System.out.println("Is the graph connected? (expect false): " + g.isConnected()); // now disconnected
    

        // resting removeVertex method
        System.out.println("\nTesting removeVertex method");
        System.out.println("Size before (3 expected): " + g.size());
        System.out.println("Removing vertex B");

        g.removeVertex("B");
        System.out.println("Size after (2 expected): " + g.size());
        System.out.println("Index of B (-1 expected): " + g.getIndex("B"));

        // only A and C remain
        System.out.println("Vertices (expect A and C): " + Arrays.toString(g.getVertices()));




        System.out.println("\nTesting removeVertex by index");        
        System.out.println("Removing vertex at [1]");

        g.removeVertex(1); // remove "B"

        System.out.println("Size after (1 expected): " + g.size());
        System.out.println("Index of C (-1 expected): " + g.getIndex("C"));        
        System.out.println("Vertices (expect A only): " + Arrays.toString(g.getVertices()));


        // testing getIndex method
        System.out.println("\nTesting getIndex method");     

        System.out.println("Index of A (0 expected): " + g.getIndex("A"));     // present 
        System.out.println("Index of C (-1 expected): " + g.getIndex("C"));    // not present 
        System.out.println("Index of Z (-1 expected): " + g.getIndex("Z"));    // not present 



        System.out.println("\nTesting indexIsValid method");     
        System.out.println("Adding back vertices B and C for testing");     

        g.addVertex("B");
        g.addVertex("C");

        System.out.println("Size after (3 expected): " + g.size());
        System.out.println("Vertices (expect A, B, C): " + Arrays.toString(g.getVertices()));

        System.out.println("Is index 0 valid (expect True): " + g.indexIsValid(0));
        System.out.println("Is index 1 valid (expect True): " + g.indexIsValid(1));
        System.out.println("Is index 2 valid (expect True): " + g.indexIsValid(2));
        System.out.println("Is index 3 valid (expect False): " + g.indexIsValid(3));
        System.out.println("Is index 10 valid (expect False): " + g.indexIsValid(10));


        System.out.println("\nTesting getVertices method");   
        System.out.println("getVertices() call (expect A, B, C): " + Arrays.toString(g.getVertices()));


        System.out.println("\nTesting isConnected method on single vertex");   
        System.out.println("Removing vertices B and C");  
 
        g.removeVertex(1); // remove B
        g.removeVertex(1); // remove C
        System.out.println("getVertices() call: " + Arrays.toString(g.getVertices()));

        System.out.println("isConnected() call (expect true, trivially connected): " + g.isConnected()); 




        System.out.println("\nTesting iteratorBFS method and DFS");   
        System.out.println("Adding vertices B, C, D, E for testing");     

        g.addVertex("B");
        g.addVertex("C");
        g.addVertex("D");
        g.addVertex("E");
        System.out.println("Vertices: " + Arrays.toString(g.getVertices()));

        System.out.println("Adding edges (A, B), (A,C), and (B,D)");     

        g.addEdge("A", "B");
        g.addEdge("A", "C");
        g.addEdge("B", "D");

        System.out.println("\nCreating BFS iterator from A");     
        Iterator<String> bfs = g.iteratorBFS("A");
        System.out.println("bfs.next(): (expect A)  " + bfs.next());
        System.out.println("bfs.next(): (expect B)  " + bfs.next());
        System.out.println("bfs.next(): (expect C)  " + bfs.next());
        System.out.println("bfs.next(): (expect D)  " + bfs.next());
        System.out.println("bfs.hasNext(): (expect false)  " + bfs.hasNext());

        System.out.println("\nCreating DFS iterator from A");     
        Iterator<String> dfs = g.iteratorDFS("A");
        System.out.println("dfs.next(): (expect A)  " + dfs.next());
        System.out.println("dfs.next(): (expect B)  " + dfs.next());
        System.out.println("dfs.next(): (expect D)  " + dfs.next());
        System.out.println("dfs.next(): (expect C)  " + dfs.next());
        System.out.println("dfs.hasNext(): (expect false)  " + dfs.hasNext());


        System.out.println("\nTesting removeEdge method on invalid indices");   
        System.out.println("Size before: " + g.size());
        System.out.println("Vertices: " + Arrays.toString(g.getVertices()));

        System.out.println("Calling removeEdge(0,5)");

        g.removeEdge(0, 5);
        System.out.println("Size after: " + g.size());
        System.out.println("Vertices: " + Arrays.toString(g.getVertices()));

        System.out.println("Calling removeEdge(-1,1)");
        g.removeEdge(-1, 1);
        System.out.println("Size after: " + g.size());
        System.out.println("Vertices: " + Arrays.toString(g.getVertices()));

        System.out.println("\n\n\nEnd of testing");
    }
}
