package LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
       LinkedList linkedList;
    @BeforeEach
    void setUp() {
       linkedList = new LinkedList();
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        linkedList.insertFirst(6);
    }

    @Test
    void insertFirst() throws CloneNotSupportedException {
        int num_of_expected_elements = 4;
        assertEquals(num_of_expected_elements, linkedList.getnElements());
        LinkedList linkedList1 = (LinkedList) linkedList.clone();
        assertEquals(num_of_expected_elements, linkedList1.getnElements());
        linkedList1.insertFirst(123);
        num_of_expected_elements++;
        assertEquals(num_of_expected_elements, linkedList1.getnElements());
    }


    @Test
    void deleteFirst() {

        assertTrue(linkedList.deleteFirst());
        linkedList.deleteFirst();
        assertEquals(2, linkedList.getnElements());
    }
}