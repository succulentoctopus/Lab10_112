class Node<E> {
    E obj;
    Node<E> prev;

    public Node(E obj) {
        this.obj = obj;
    }
}


public class MyGenericDS<E> implements GenericOrderedCollection<E>{
    // your code here

    Node<E> end;
    private static int length = 0;

    public MyGenericDS() {
        end = null;
    }

    public void append(E toAppend) {
        Node appendedNode = new Node(toAppend);
        appendedNode.prev = end;
        end = appendedNode;
        length++;
    }

    public E peek() {
        if (end == null) {
            return null;
        }
        return end.obj;
    }

    public E pop() {
        if (end == null) {
            return null;
        }
        E fin = end.obj;
        end = end.prev;
        length--;
        return fin;
    }

    public void remove(int index) {
        Node n = end;
        int count = length();
        //if index > count throw an exception
        if (count >= index && index < 0) {
            while (count > index) {
                n = n.prev;
                count--;
            }
            n.prev = n.prev.prev;
            length--;
        }

    }

    public String toString() {
        String s = "";
        Node n = end;
        while (n!= null) {
            s = n.obj + " " + s;
            n = n.prev;
        }
        return s;
    }

    public int length() {
        return length;
    }
}