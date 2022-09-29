package Classprep;

class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;

    }

    public void displaynode() {
        System.out.print(data);
    }
}

class LinkdedList<T> {
    private Node<T> head;

    public LinkdedList() {
        head = null;
    }

    public void prepend(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
    }

    public Node<T> append(T data) {
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

    public Node<T> deleteFirst() {
        if (head == null) {
            throw new IndexOutOfBoundsException("LinkedList doesn't contain any Nodes.");
        }
        Node<T> current = head;
        head = head.next;
        return current;
    }

    public Node<T> deleteLast() {
        if (head == null)
            throw new IndexOutOfBoundsException("LinkedList doesn't contain any Nodes.");
        if (head.next == null)
            return head;
        else {
            Node<T> currNode = head;
            Node<T> prevNode = null;
            while (currNode.next != null) {
                prevNode = currNode;
                currNode = currNode.next;
            }
            prevNode.next = null;
        }
        return head;
    }

    private Node<T> deleteRecursiveInner(Node<T> node, Node<T> prev) {
        Node<T> deletedNode;
        if (node.next != null) { // cannot delete right now, we have to move forward recursively
            return deleteRecursiveInner(node.next, node);
        }

        deletedNode = prev.next;
        prev.next = null;
        return deletedNode;
    }

    public Node<T> deleteRecursive() {
        if (head == null)
            throw new IndexOutOfBoundsException("LinkedList doesn't contain any Nodes.");
        if (head.next == null)
            return head;

        return deleteRecursiveInner(this.head, head.next);

    }

    public void displayLinkedList() {
        System.out.print("[");
        Node<T> tempDisplay = head;
        while (tempDisplay != null) {
            tempDisplay.displaynode();
            tempDisplay = tempDisplay.next;
        }
        System.out.println("]");

    }

    public Node<T> reverseIterative() {
        Node<T> currNode = head;
        Node<T> prevNode = null;
        Node<T> next = null;
        while (currNode != null) {
            next = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = next;
        }
        head = prevNode;
        return head;
    }
    public Node<T> reverse(Node<T> slow) {
        Node<T> prev=null;
        Node<T> next=null;
        while(slow!=null) {
            next = slow.next;
            slow.next = prev;
            prev=slow;
            slow=next;
        }
        return prev;
    }

    private Node<T> reverseR(Node<T> prevNode, Node<T> currentNode) {
        if (currentNode == null)
            return prevNode;
        Node<T> nextNode = currentNode.next;
        currentNode.next = prevNode;
        return reverseR(currentNode, nextNode);
    }

    public void reverseRecursive() {
        if (this.head == null || this.head.next == null)
            return;
        this.head = reverseR(null, this.head);
    }

    private void displayRecursiveInner(Node<T> node) {
        if (node != null) {
            System.out.print(node.data + " ");
            displayRecursiveInner(node.next);

        }

    }

    public void displayRecursive() {
        displayRecursiveInner(this.head);
    }

    private T getvaluefromLastInner(int node) {
        Node<T> first = head;
        Node<T> second = head;
        if (head == null)
            return null;
        for (int i = 0; i < node; i++) {
            if (first == null) {
                System.out.print("Not a valid input" + "/");
                return null;
            }
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second.data;
    }

    public T getValue(int node) {
        return getvaluefromLastInner(node);
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

    private boolean isPalindrome(Node<T> head) {
        if(head==null||head.next==null) 
           return true;
            
        Node<T> slow = head;
        Node<T> fast = head;
            
        while(fast.next!=null&&fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
            
        slow.next = reverse(slow.next);
        slow = slow.next;
        Node<T> temp = head;
            
        while(slow!=null) {
            if(temp.data != slow.data) 
               return false;
            temp = temp.next;
            slow = slow.next;
        }
        return true;
    }

    public boolean checkPalindrome(){
        return isPalindrome(this.head);
    }

    public static void main(String[] args) {
        LinkdedList<String> linkedList = new LinkdedList<String>();
        linkedList.append("r");
        linkedList.append("o");
        linkedList.append("t");
        linkedList.append("a");
        linkedList.append("t");
        linkedList.append("o");
        linkedList.append("r");
       
      
        System.out.println(linkedList.checkPalindrome());
  

    }

}
