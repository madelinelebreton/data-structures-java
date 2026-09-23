/*
* TestHashTable.java
* Author: Madeline LeBreton
* Date: 04/09/2025
* Tests my HashTable.java implementation
*/

public class TestHashTable {

    public static void main(String[] args) {
        BookHashTable ht = new BookHashTable();
        System.out.println("\nTesting my implementation of a Hash Table");

        System.out.println("\nInitial insertions (collisions expected)");
        System.out.println("Putting 1234567890, 9876543890, 1112222890 as Book A, B, and C");

        // deliberate collisions: last 3 digits 890
        ht.put("1234567890", "Book A"); 
        ht.put("9876543890", "Book B"); 
        ht.put("1112222890", "Book C"); 

        System.out.println("\nPutting 5556667771 and 2223334771 as Book D and E");
        // deliberate collisions: last 3 digits 771
        ht.put("5556667771", "Book D"); 
        ht.put("2223334771", "Book E"); 

        System.out.println("\nCurrent table: ");
        ht.printTable();
        

        System.out.println("\nTesting get() method");
        System.out.println("Get 1234567890: " + ht.get("1234567890"));
        System.out.println("Get 9876543890: " + ht.get("9876543890"));
        System.out.println("Get 0000000000 (not in table): " + ht.get("0000000000"));

        System.out.println("\nTesting remove() method");
        System.out.println("Remove 9876543890: " + ht.remove("9876543890"));
        System.out.println("Remove 0000000000 (not in table): " + ht.remove("0000000000"));
        System.out.println("\nCurrent table: ");
        ht.printTable();

        System.out.println("\nCurrent size:" + ht.getCapacity());
        System.out.println("Adding more books to trigger resize");
        ht.put("1111111111", "Book F");
        ht.put("2222222222", "Book G");
        ht.put("3333333333", "Book H");
        ht.put("4444444444", "Book I");
        ht.put("5555555555", "Book J");

        System.out.println("Size after:" + ht.getCapacity());


        System.out.println("\nCurrent table: ");
        ht.printTable();

        System.out.println("Testing get() method after resize");
        System.out.println("Get 5555555555: " + ht.get("5555555555"));
        System.out.println("Get 1112222890: " + ht.get("1112222890"));

        System.out.println("Testing remove after resize");
        System.out.println("Remove 1234567890: " + ht.remove("1234567890"));
        System.out.println("\nCurrent table: ");
        ht.printTable();


        // demonstrate how the same set of values can result in different hashes, depending on the order in which they are added

        System.out.println("\n\nThe same set of values can result in different hashes, depending on order in which they are added");

        BookHashTable ht1 = new BookHashTable();
        ht1.put("1234567890", "A");
        ht1.put("9876543890", "B");
        ht1.put("1112222890", "C");

        System.out.println("\n\nInsertion order: A, B, C");
        ht1.printTable();

        BookHashTable ht2 = new BookHashTable();
        ht2.put("1112222890", "C");
        ht2.put("1234567890", "A");
        ht2.put("9876543890", "B");

        System.out.println("\n\nInsertion order: C, A, B");
        ht2.printTable();
    }
}
