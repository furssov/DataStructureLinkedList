package LinkedList.Doubly;

public class DoublyLinkedList {
    private DoublyLink first;
    private DoublyLink last;
    private int nElements;

    public DoublyLinkedList()
    {
        first = null;
        last = null;
        nElements = 0;
    }

    public void insertFirst(int value)
    {
        DoublyLink doublyLink = new DoublyLink(value);
        if (first == null)
        {
            last = doublyLink;
        }
        else
        {
            first.previous = doublyLink;
        }
        doublyLink.next = first;
        first = doublyLink;
        nElements++;
    }
    public void insertLast(int value)
    {
        DoublyLink doublyLink = new DoublyLink(value);
        if (first == null)
        {
            first = doublyLink;
        }
        else
        {
            last.next = doublyLink;
            doublyLink.previous = last;
        }
        last = doublyLink;
        nElements++;
    }

    public boolean insertAfter(int value, int after)
    {
        DoublyLink doublyLink = new DoublyLink(value);
        DoublyLink current = first;
        while(current != null && current.value != after)
        {
            current = current.next;
        }
        if (current == null)
        {
            return false;
        }
        else {
            doublyLink.next = current.next;
            doublyLink.previous = current;
            current.next = doublyLink;
            nElements++;
            return true;
        }

    }

    public boolean delete(int key)
    {
        if (first != null)
        {
            DoublyLink doublyLink = first;
            while (doublyLink != null && doublyLink.value != key)
            {
                doublyLink = doublyLink.next;
            }
            if (doublyLink == null)
            {
                return false;
            }
            if (doublyLink == first)
            {
                first = doublyLink.next;
            }
            else
            {
            doublyLink.previous.next = doublyLink.next;
            }
            if (doublyLink == last)
            {
                last = doublyLink.previous;
            }
            else
            {
                doublyLink.next.previous = doublyLink.previous;
            }
            return true;
        }
        return false;
    }

        public void  displayList()
        {
            DoublyLink doublyLink = first;
            while (doublyLink != null)
            {
                System.out.println(doublyLink.value);
                doublyLink = doublyLink.next;
            }
        }
    public int getnElements() {
        return nElements;
    }
}
