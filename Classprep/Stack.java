package Classprep;

import java.util.Arrays;


public class Stack {
    int size = 0;
    private int top = 0;
    private int Data[];

    public Stack(int size) {
        this.size = size;
        Data = new int[size];
        top = -1;
    }

    public void push(int i) {
        if (size == Data.length)
            expandSize();
        Data[++top] = i;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return Data[top--];
    }

    public int peak(){
        return top;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int getSize() {
        return Data[size];
    }

    private void expandSize() {
        int increasedSize = size * 2;
        Data = Arrays.copyOf(Data, increasedSize);

    }

    public void display() {
        System.out.print("[");
        System.out.print(Data[0]);
        for (int i = 0; i < top; i++) {
            System.out.print(", " + Data[i + 1]);

        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.display();
    }

}
