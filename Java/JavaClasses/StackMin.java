package Java.JavaClasses;

public class StackMin {

    private Java.JavaClasses.Stack inputStack;
    private Java.JavaClasses.Stack outputStack;

    public StackMin() {
        inputStack = new Java.JavaClasses.Stack(5);
        outputStack = new Java.JavaClasses.Stack(5);
    }

    public void push(int i)
    {     
        inputStack.push(i);
        if (outputStack.isEmpty()) {
            outputStack.push(i);
        }
        else {
            if (i <= outputStack.peek()) {
                outputStack.push(i);
            }
        }
    }

    public int pop() {
        int top = inputStack.pop();
        if (top == outputStack.peek())
            outputStack.pop();
        return top;
    }

    public int top() {
        return inputStack.peek();
    }

    public int getSize() {
        return inputStack.size;
    }

    public boolean isEmpty() {
        return inputStack.isEmpty();
    }

    public int getMin(){
        return outputStack.peek();
    }

    public static void main(String[] args) {
        StackMin inputStack = new StackMin();
        inputStack.push(7);
        inputStack.push(8);
        inputStack.push(9);
        inputStack.push(5);
        System.out.print(inputStack.getMin());
       
    }

}