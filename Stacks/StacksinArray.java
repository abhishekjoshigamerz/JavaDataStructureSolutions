package Stacks;

import java.util.Stack;

public class StacksinArray {
    private int data[];
    private int topIndex;

    StacksinArray() {
        this.topIndex = -1;
        data = new int[10];
    }

    public int size() {
        return this.topIndex + 1;
    }

    public boolean isEmpty() {
        return this.topIndex == -1;
    }

    public void push(int elem) throws StackFullException {
        // If stack is full
        if (topIndex == data.length - 1) {
            StackFullException e = new StackFullException();
            throw e;
            // Throw Exception
        }
        topIndex++;
        data[topIndex] = elem;

    }

    public int top() throws StackEmptyException {
        if (topIndex == -1) {
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return data[topIndex];
    }

    public int pop() throws StackEmptyException {
        if (topIndex == -1) {
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }

}
