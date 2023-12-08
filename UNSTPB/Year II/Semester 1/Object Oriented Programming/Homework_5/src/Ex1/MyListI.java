package Ex1;

public interface MyListI<T>{
    public void add(T val);
    public T getElementAt(int index);
    public int size();
    public MyIteratorI<T> iterator();
}