package LinkedList;

public class LinkedList  implements Cloneable{

private Link first;
private int nElements;

    @Override
    protected Object clone() throws CloneNotSupportedException {
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
    class Link{
        public int value;
        public Link next;

        public Link(int value) {
            this.value = value;
        }
    }
}
