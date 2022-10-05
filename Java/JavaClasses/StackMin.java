package Classprep;

public class StackMin {

    private Classprep.Stack MainStack;
    private Classprep.Stack MinStack;

    public StackMin() {
        MainStack = new Classprep.Stack(5);
        MinStack = new Classprep.Stack(5);
    }

    public void push(int i)
    {     
        MainStack.push(i);
        if (MinStack.isEmpty()) {
            MinStack.push(i);
        }
        else {
            if (i <= MinStack.peek()) {
                MinStack.push(i);
            }
        }
    }

    public int pop() {
        int top = MainStack.pop();
        if (top == MinStack.peek())
            MinStack.pop();
        return top;
    }

    public int top() {
        return MainStack.peek();
    }

    public int getSize() {
        return MainStack.size;
    }

    public boolean isEmpty() {
        return MainStack.isEmpty();
    }

    public int getMin(){
        return MinStack.peek();
    }

    public static void main(String[] args) {
        StackMin MainStack = new StackMin();
        MainStack.push(7);
        MainStack.push(8);
        MainStack.push(9);
        MainStack.push(5);
        System.out.print(MainStack.getMin());
       
    }

}