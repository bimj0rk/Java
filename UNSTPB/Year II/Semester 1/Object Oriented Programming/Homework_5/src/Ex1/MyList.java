package Ex1;

public class MyList<T> implements MyListI<T>{
    class Node{
        T item;
        Node prev;
        Node next;
        int index = -1;

        public Node(T item){
            this.item = item;
            this.index++;
        }

        public T getItem(){
            return item;
        }
    }

    Node head, tail = null;
    int size = 0;

    @Override
    public void add(T val) {
        Node newNode = new Node(val);
        size++;

        if(head == tail){
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    @Override
    public T getElementAt(int index) {
        
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public MyIterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }
}
