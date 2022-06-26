package Stacks.ArrayStack;

import ADTS.StackADT;

public class ArrayStack<T> implements StackADT<T> {

    private int size;
    private T[] items;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        this.size = 0;
        items = (T[]) (new Object[100]);
    }

    @SuppressWarnings("unchecked")
    public void resize() {
        T[] items = (T[])(new Object[items.length * 2]);
    }

    // #region Overrides
    @Override
    public void push(T itemToPush) {

    }

    @Override
    public T pop() {

        return null;
    }

    @Override
    public T peek() {

        return null;
    }

    @Override
    public int getSize() {

        return 0;
    }

    @Override
    public boolean isEmpty() {

        return false;
    }

    // #endregion

}
