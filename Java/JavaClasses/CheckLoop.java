package Java.JavaClasses;

import java.util.HashSet;
import java.util.Set;

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
        if(node == null || node.next == null){
            return false;
        }
        Node<T> fast = node;
        Node<T> slow = node;
        while(fast.next.next != null && slow.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public boolean loopExists() {
        return checkloopPointers(this.head);
    }

    public void findMiddle() {
        Node<T> slow = head;
        Node<T> fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);

    }

    private Node<T> deleteDuplicatesInner(Node<T> node) {
        Node<T> cur = node;
        Node<T> prev = null;
        Set<T> set = new HashSet<>();
        while(cur!=null){
            T duplicates = cur.data;
            if(set.contains(duplicates)){
                prev.next = cur.next;
                prev = cur;
            }
            set.add(duplicates);
            cur = cur.next;
        }
        return prev;
        

    }
    public Node<T> deleteDuplicates(){
        return deleteDuplicatesInner(this.head);
    }


    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        linkedlist.add(2);
        linkedlist.add(4);
        linkedlist.add(2);
        linkedlist.add(8);

        linkedlist.deleteDuplicates();
        

    }

}
