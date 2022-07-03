package LinkedList.Link;

import LinkedList.Link.Link;

public class LinkedList  implements Cloneable{

private Link first;
private int nElements;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public LinkedList() {
        first = null;
        nElements = 0;
    }

    public int getnElements() {
        return nElements;
    }

    public boolean isEmpty()
    {
        return (first==null);
    }

    public void insertFirst(int value)
    {
        Link newLink = new Link(value);
        newLink.next = first;
        first = newLink;
        nElements++;
    }
      public boolean deleteFirst()
      {
          if (!isEmpty())
          {
              first = first.next;
              nElements--;
              return true;
          }
          else return false;
      }

      public boolean findElement(int searchKey) {

              Link link = first;
              while (link!=null)
              {
                  if (link.value == searchKey)
                  {
                      return true;
                  }
                  else {
                      link = link.next;
                  }
              }

              return false;
      }

      public boolean deleteByKey(int key)
      {
          Link previous = first;
          Link current = first;

          while (current.value!=key)
          {
              if (current.next == null)
              {
                  return false;
              }
              previous = current;
              current = current.next;
          }
          if (current == first)
          {
              nElements--;
              return deleteFirst();
          }
          else
          {
              previous.next = current.next;
              nElements--;
              return true;
          }
      }



}
