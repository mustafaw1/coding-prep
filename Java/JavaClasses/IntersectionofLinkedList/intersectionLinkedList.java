package Java.JavaClasses.IntersectionofLinkedList;

import java.util.HashSet;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        HashSet<ListNode> set = new HashSet<>();
        // ListNode first_ptr = headA;
        // ListNode second_ptr = headB;
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while(headB != null){
            if(set.contains(headB))
               return headB;
           
            headB = headB.next;

        }
        return null;
    }
   

public static void main(String[] args) {

    ListNode list1 = new ListNode(4);
    list1.next = new ListNode(1);
    list1.next.next = new ListNode(8);
    list1.next.next.next = new ListNode(4);
    list1.next.next.next.next = new ListNode(5);

    ListNode list2 = new ListNode(5);
    list2.next = new ListNode(6);
    list2.next.next = new ListNode(1);
    list2.next.next = new ListNode(8);
    list2.next.next.next = new ListNode(4);
    list2.next.next.next.next = new ListNode(5);
    list2.next.next.next.next.next = list1.next.next;
    
    System.out.println(getIntersectionNode(list1, list2));



}
}
