package LinkedList;

import LinkedList.Link.FirstLastList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstLastListTest {

    FirstLastList list;

    @BeforeEach
    void setUp() {
        list = new FirstLastList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
    }

    @Test
    void insertFirst() {
        assertEquals(3, list.getnElements());
        list.insertFirst(4);
        list.insertFirst(5);
        assertEquals(5, list.getnElements());
    }

    @Test
    void insertLast() {
        list.insertLast(4);
        list.insertLast(5);
        assertEquals(5, list.getnElements());
    }

    @Test
    void deleteFirst() {
        list.deleteFirst();
        list.deleteFirst();
        assertEquals(1, list.getnElements());
        list.deleteFirst();
        assertEquals(0, list.getnElements());
        assertFalse(list.deleteFirst());
    }
}