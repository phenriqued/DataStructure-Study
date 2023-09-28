package Test.LinkedListDataStructure;

import MainApplication.LinkedListsDataStructure.LinkedLists;
import org.junit.jupiter.api.*;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListsTest {

    private static LinkedLists listsStrings = new LinkedLists<String> ();

    @BeforeAll
    static void setup(){
        listsStrings.add("AC");
        listsStrings.add("AM");
        listsStrings.add("DF");
        listsStrings.add("SP");
        listsStrings.add("MG");
        listsStrings.add("RJ");
    }

    @Test
    @DisplayName("It should return the size of the list")
    void getSize() {
        Integer size = 5;
        assertEquals(size, listsStrings.getSize());
    }
    @Test
    @DisplayName("It should return the first of the list")
    void getFirst() {
        assertEquals("AC" ,listsStrings.getFirst().toString());
    }
    @Test
    @DisplayName("It should return the last of the list")
    void getLast() {
        assertEquals("MG", listsStrings.getLast().toString());
    }
    @Test
    @DisplayName("should be able to add one more to the list by changing the size of the list.")
    void add() {
        listsStrings.add("ES");
        assertEquals("ES",listsStrings.getLast().toString());
    }
    @Test
    @DisplayName("should be able to remove one in the list by changing the list size")
    void remove() {
        Integer size = 6;
        assertEquals(size, listsStrings.getSize());
        listsStrings.remove("RJ");
        size--;
        assertEquals(size, listsStrings.getSize());
    }
    @Test
    @DisplayName("must be able to return an Object that is or would be in the given position")
    void get() {
        assertEquals("AC",listsStrings.get(1).toString());
    }


}