package JavaClasses;

public class QueueUsingStack {
    private JavaClasses.Stack inputStack;
    private JavaClasses.Stack OutputStack;
    private int size;

    public QueueUsingStack() {
        inputStack = new JavaClasses.Stack(5);
        OutputStack = new JavaClasses.Stack(5);
    }

    public void enqueue(int i) {
        inputStack.push(i);
        size++;

    }

    public void dequeue() {
        if (OutputStack.isEmpty())
            while (!inputStack.isEmpty())
                OutputStack.push(inputStack.pop());

        if (!OutputStack.isEmpty()) {
            OutputStack.pop();
            size--;
        }

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.dequeue();
        queue.dequeue();

    }


}
