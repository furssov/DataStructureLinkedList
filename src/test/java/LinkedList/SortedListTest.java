package LinkedList;

import LinkedList.Link.SortedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedListTest {

 SortedList sortedList;

    @BeforeEach
    void setUp() {
        sortedList = new SortedList();
        sortedList.insert(10);
        sortedList.insert(5);
        sortedList.insert(20);
        sortedList.insert(15);
    }

    @Test
    void insert() {
        assertEquals(4, sortedList.getnElements());
        sortedList.insert(25);
        assertEquals(5, sortedList.getnElements());
    }

    @Test
    void delete() {
        assertTrue(sortedList.delete(10));
        assertFalse(sortedList.delete(33));
        assertEquals(3, sortedList.getnElements());
        assertTrue(sortedList.delete(15));
        assertEquals(2, sortedList.getnElements());

    }
}