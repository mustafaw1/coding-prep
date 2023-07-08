package Java.JavaClasses;

class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;

    }

    public void displayNode() {
        System.out.print(data + " ");

    }
}

class LinkdedListQueue<T> {
    private Node<T> head;

    public LinkdedListQueue() {
        head = null;
    }

   

    public Node<T> enqueue(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null)
            head = newNode;
        else {
            Node<T> temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
            return head;
        }
        return newNode;
    }

    public Node<T> dequeue() {
        if (head == null) {
            throw new IndexOutOfBoundsException("Queue doesn't contain any Elements.");
        }
        Node<T> current = head;
        head = head.next;
        return current;
    }

   

    public void displayLinkedList() {
        System.out.print("[");
        Node<T> tempDisplay = head;
        while (tempDisplay != null) {
            tempDisplay.displayNode();
            tempDisplay = tempDisplay.next;
        }
        System.out.println("]");

    }

    public static void main(String[] args) {
        LinkdedListQueue<Integer> linkedList = new LinkdedListQueue<Integer>();
        linkedList.enqueue(1);
        linkedList.enqueue(2);
        linkedList.enqueue(3);
        linkedList.enqueue(4);
        linkedList.enqueue(5);
        linkedList.enqueue(6);
        
        linkedList.dequeue();
        linkedList.dequeue();

        
        linkedList.displayLinkedList();
    }

}