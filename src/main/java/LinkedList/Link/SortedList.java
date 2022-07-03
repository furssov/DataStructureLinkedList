package LinkedList.Link;

import LinkedList.Link.Link;

public class SortedList {

    private Link first;

    private int nElements;
    public SortedList() {
        first = null;
        nElements = 0;
    }

    public int getnElements() {
        return nElements;
    }

    public void insert (int value)
    {
        Link link = new Link(value);
        Link current = first;
        Link previous = null;
        while (current != null && value > current.value)
        {
            previous = current;
            current = current.next;
        }
        if (previous == null)
        {
            first = link;
        }
        else {
            previous.next = link;
        }
        link.next = current;
        nElements++;
    }

    public boolean delete(int value)
    {
        if (first !=null)
        {
            Link current  = first;
            Link previous = null;
            while (current != null && value != current.value)
            {
                previous = current;
                current = current.next;
            }
            if (current == null)
            {
                return false;
            }
            else {
                current = current.next;
                previous.next = current;
                nElements--;
                return true;
            }
        }
        return false;
    }
}
