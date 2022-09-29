package Classprep;

import java.util.HashSet;

class Node<T> {
    public T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

class LinkedList<T> {
    Node<T> head;

    public LinkedList() {
        head = null;

    }

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;

    }

    private boolean checkLoopInner(Node<T> node) {
        HashSet<Node<T>> set = new HashSet<Node<T>>();
        while (node != null) {
            if (set.contains(node))
                return true;
            set.add(node);
            node = node.next;
        }
        return false;
    }

    public boolean checkloopPointers(Node<T> node){
        Node<T> fast = head;
        Node<T> slow = head;
        if(node.next == null)
          return false;
        while(fast.next.next != null && slow.next != null)
        {
           fast = fast.next.next;
           slow = slow.next;
           if(slow == fast)
             return true;
        }
        return false;
    }

    public boolean loopExists() {
        return checkloopPointers(this.head);
    }
    public void  findMiddle()
    {
        Node<T> slow = head;
        Node<T> fast = head;
         
            while (fast != null && fast.next != null)
            {
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println(slow.data);
         
    }
        


    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        linkedlist.add(2);
        linkedlist.add(4);
        linkedlist.add(6);
        linkedlist.add(8);
        linkedlist.add(10);
        linkedlist.findMiddle();

        
    }

}
