package Java.JavaClasses.IntersectionofLinkedList;

import java.util.HashSet;


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null ) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static ListNode intersection(ListNode headA, ListNode headB) {
        ListNode first_ptr = headA;
        ListNode second_ptr = headB;
        while(first_ptr != null){
            first_ptr = first_ptr.next;
            
        }
        if(first_ptr == null){
            second_ptr = second_ptr.next;
        }
        first_ptr = headA;
        if(second_ptr == first_ptr){
            return second_ptr;
        }
    
        
        return null;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        // ListNode first_ptr = headA;
        // ListNode second_ptr = headB;
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB))
                return headB;

            headB = headB.next;

        }
        return null;
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0)
            return head;
        ListNode temp = head;
        int count = 0;
        while (temp.next != null) {
            temp = temp.next;
            count++; // 4
        }
        // temp = 5
        temp.next = head; // link 5 to head 1

        // count = 4
        k = k % (count + 1);
        int breakLink = count - k; // 4-2 = 2
        temp = head;
        while (breakLink != 0) {
            temp = temp.next;
            breakLink--;
        }
        // temp -> 5
        ListNode newHead = temp.next; // 4
        temp.next = null;
        return newHead;

    }
    public static ListNode removeElements(ListNode node, int val) {
        while(node!=null && node.val == val){
            node = node.next;
        }
        while(node == null){
            return null;
        } 
        ListNode temp = node;
        while(temp.next!=null){
            if(temp.next.val == val)
              temp.next = temp.next.next;
            else
             temp = temp.next;
        }
        return node;
        
        
    }

    public static void deleteDuplicatesInner(ListNode node) {
        HashSet<Integer> set = new HashSet<>();

        ListNode cur = node;
        ListNode prev = null;

        while (cur != null) {
            int duplicates =  cur.val;

            if (set.contains(duplicates)) {
                prev.next = cur.next;
            } else {
                set.add(duplicates);
                prev = cur;
            }
            cur = cur.next;
        }
       
    }

    

public static void main(String[] args) {

    ListNode list1 = new ListNode(1);
    list1.next = new ListNode(2);
    list1.next.next = new ListNode(1);
    list1.next.next.next = new ListNode(4);
    // list1.next.next.next.next = new ListNode(7);
    // list1.next.next.next.next.next = new ListNode(7);
    // list1.next.next.next.next.next.next = new ListNode(7);
    removeElements(list1, 4);
    printList(list1);



    // ListNode list2 = new ListNode(5);
    // list2.next = new ListNode(6);
    // list2.next.next = new ListNode(1);
    // list2.next.next.next = new ListNode(8);
    // list2.next.next.next.next = new ListNode(4);
    // list2.next.next.next.next.next = list1.next.next;


    

}
}
