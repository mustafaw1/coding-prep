package Classprep;

import java.util.Arrays;

public class Queue {
    private int Data[];
    private int size;
    private int front;
    private int rear;
    int Elements = 0;

    public Queue(int size) {
        this.size = size;
        Data = new int[this.size];
        rear = 0;
        front = 0;
    }
                            
    public void enqueue(int i){
        if (size == Data.length)
            expandSize();
        if (rear == size)
            rear = 0;
        Data[rear++] = i;
        Elements++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IndexOutOfBoundsException("Queue is empty");
        if (front == size)
            front = 0;
        int deleteElement = Data[front++];
        Elements--;
        return deleteElement;

    }

    public int peek() {
        return Data[front];
    }

    public boolean isEmpty() {
        return (Elements == 0);
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
        for (int i = 0; i < Elements - 1; i++) {
            System.out.print(", " + Data[i + 1]);

        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.dequeue();
        queue.dequeue();

        queue.enqueue(8);
        queue.enqueue(6);


        queue.display();

    }

}
