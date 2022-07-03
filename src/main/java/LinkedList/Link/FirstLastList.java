package LinkedList.Link;

import LinkedList.Link.Link;

public class FirstLastList {
    private Link first;
    private Link last;

    public int getnElements() {
        return nElements;
    }

    private int nElements;

    public FirstLastList()
    {
        first = null;
        last = null;
        nElements = 0;
    }

    public void insertFirst(int value)
    {
        Link link = new Link(value);
        if (first == null)
        {
            last = link;
        }
        link.next = first;
        first = link;
        nElements++;
    }

    public void insertLast(int value)
    {
         Link link = new Link(value);
         if (first == null)
         {
             first = link;
         }
         else
         {
             last.next = link;
         }
         last = link;
         nElements++;

    }
     public boolean deleteFirst()
     {
         if (first != null)
         {
             if (first.next == null)
             {
                 last = null;
             }
             first = first.next;
             nElements--;
             return true;
         }
         return false;
     }

}
