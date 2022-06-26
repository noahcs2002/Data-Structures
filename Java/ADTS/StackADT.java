package ADTS;

public interface StackADT<T> {

    public void push(T itemToPush);

    public T pop();

    public T peek();

    public int getSize();

    public boolean isEmpty();

}
