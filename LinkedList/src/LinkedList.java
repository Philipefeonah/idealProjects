import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item){
        var node = new Node(item);

       // if (first == null)
            if (isEmpty())
                first = last = node;
            else{
                last.next = node;
                last = node;

        }
        size++;

    }

    public void addFirst(int item) {
        var node = new Node(item);
        //if (first == null)
            if (isEmpty())
                first = last = node;
        else {
            first.next = node;
            first = node;

        }
        size++;
    }
    private boolean isEmpty(){
        return first == null;
    }
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != first) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;

        }
        return -1;
    }

    public  boolean contains(int item) {
        return indexOf(item) !=-1;
    }

    public void removeFirst(){
        if (isEmpty())
            throw new NoSuchElementException();

        if(first == last){
            first = last = null;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;
        size--;
    }

    public void removeLast(){
        var previous = getPrevious(last);
        last=previous;
        last.next = null;
        }
        private Node getPrevious(Node node){
            var current = first;
            while (current!=null){
                if (current.next == node) return current;
                current = current.next;
                size--;

            }
            return null;

    }

    public  int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while (current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }
}
