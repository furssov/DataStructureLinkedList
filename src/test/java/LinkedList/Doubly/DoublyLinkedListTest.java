package LinkedList.Doubly;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    DoublyLinkedList doublyLinkedList;
    @BeforeEach
    void setUp() {
        doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(20);
        doublyLinkedList.insertFirst(15);
        doublyLinkedList.insertFirst(5);
    }

    @Test
    void tAfter() {
        assertEquals(3, doublyLinkedList.getnElements());

        assertFalse(doublyLinkedList.insertAfter(10, 21));
        assertTrue(doublyLinkedList.insertAfter(10, 20));
        assertTrue(doublyLinkedList.insertAfter(10, 5));
        assertEquals(5, doublyLinkedList.getnElements());

       // doublyLinkedList.displayList();
    }

    @Test
    void delete() {
        assertTrue(doublyLinkedList.delete(5));
        assertTrue(doublyLinkedList.delete(20));
        assertFalse(doublyLinkedList.delete(21));
        doublyLinkedList.displayList();
    }
}