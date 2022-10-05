package JavaClasses;

public class StackUsingQueue {
    private JavaClasses.Queue inputQueue;
    private JavaClasses.Queue outputQueue;
    private int size;

    public StackUsingQueue() {
        inputQueue = new JavaClasses.Queue(6);
        outputQueue = new JavaClasses.Queue(6);
    }

    public void push(int i) {

        while (!inputQueue.isEmpty()) {
            int temp = inputQueue.dequeue();
            outputQueue.enqueue(temp);
        }

        inputQueue.enqueue(i);

        while (!outputQueue.isEmpty()) {
            int temp = outputQueue.dequeue();
            inputQueue.enqueue(temp);
        }
    }

    public int pop() {
        return inputQueue.dequeue();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());

    }

}
