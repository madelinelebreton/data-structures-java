/*
* HashTable.java
* Author: Madeline LeBreton
* Date: 04/09/2025
* Implements a dynamically resizable hash table to store book names and 10-digit ISBN numbers
*/


import java.util.Arrays;

class BookHashTable {
    private static class Entry {
        String isbn;
        String bookName;
        Entry(String isbn, String bookName) {
            this.isbn = isbn;
            this.bookName = bookName;
        }

        // override toString method to include isbn and name
        @Override
        public String toString() {
            return isbn + ": " + bookName;
        }
    }

    private Entry[] table;
    private int size;
    private final double LOAD_FACTOR = 0.70; // desired load factor as given 

    public BookHashTable() {
        table = new Entry[11]; // initial table size 11
        size = 0; // number of stored books is 0
    }

    // hash function using last 3 digits of ISBN
    private int hash(String isbn) {
        String last3 = isbn.substring(isbn.length() - 3); // extraction method
        return Integer.parseInt(last3) % table.length;
    }

    // insert book
    public void put(String isbn, String bookName) {
        // make the table bigger if necessary
        if ((double) (size + 1) / table.length > LOAD_FACTOR) {
            resize();
        }

        // use the hash function to determine the index
        int index = hash(isbn);
        int startIndex = index;

        // linear probing
        while (table[index] != null) {
            index = (index + 1) % table.length;
            if (index == startIndex) {
                throw new RuntimeException("HashTable full!"); // should not happen after resize
            }
        }
        table[index] = new Entry(isbn, bookName);
        size++; // increment counter that tracks number of entries
    }

    // find book by ISBN
    public String get(String isbn) {
        int index = hash(isbn);
        int startIndex = index;

        // find item given that collisions were handled with linear probing
        while (table[index] != null) {
            if (table[index].isbn.equals(isbn))
                return table[index].bookName;
            index = (index + 1) % table.length;
            if (index == startIndex) break;
        }
        return null;
    }

    // remove book by ISBN
    public boolean remove(String isbn) {
        int index = hash(isbn);
        int startIndex = index;

        // find and remove book given linear probing if there was a collision
        while (table[index] != null) {
            if (table[index].isbn.equals(isbn)) {
                table[index] = null;
                size--;
                // rehash subsequent elements to avoid "holes"
                rehashFrom(index);
                return true;
            }
            index = (index + 1) % table.length; // recalculate next index to loop around
            if (index == startIndex) break;
        }
        return false;
    }

    // used to rehash subsequent elements during removal to avoid holes
    private void rehashFrom(int emptyIndex) {
        int index = (emptyIndex + 1) % table.length;
        while (table[index] != null) { // search until end of possible collisions
            Entry entry = table[index];
            table[index] = null;
            size--; // keep track of removal
            put(entry.isbn, entry.bookName); // reinsert, and automatically increments size
            index = (index + 1) % table.length;
        }
    }

    // make the table bigger if it is getting full
    private void resize() {
        Entry[] oldTable = table; // save a copy of the old table
        int newSize = table.length * 2; // double the size of the table
        table = new Entry[newSize];
        size = 0; // reset table size counter

        for (Entry e : oldTable) {
            if (e != null) {
                put(e.isbn, e.bookName); // automatically increments size
            }
        }
    }

    // similar to toString() method
    public void printTable() {
        System.out.println("Hash Table Contents:");
        for (int i = 0; i < table.length; i++) { // for each bucket in the table, print the element or null
            System.out.print(i + ": ");
            if (table[i] != null) System.out.println(table[i]);
            else System.out.println("null");
        }
    }

    // for testing resize
    public int getCapacity() {
        return table.length;
    }
}
