/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // if (head == null || head.next == null) return null;

        // ListNode slow = head;
        // ListNode fast = head;

        // while (fast != null && fast.next != null) {
        //     slow = slow.next;
        //     fast = fast.next.next;

        //     if (slow == fast) {  
        //         ListNode entry = head;
        //         while (entry != slow) {
        //             entry = entry.next;
        //             slow = slow.next;
        //         }
        //         return entry; 
        //     }
        // }

        // return null; // no cycle

        // ListNode slow= head;
        // ListNode fast=head;


        // while(fast != null && fast.next != null){
        //     slow= slow.next;
        //     fast= fast.next.next;

        //     if(slow==fast){
        //         ListNode tail=head;
        //         while(tail != slow){
        //             tail=tail.next;
        //             slow=slow.next;
        //         }
        //         return tail;
        //     }
        // }
        // return null;


        HashSet<ListNode> set= new HashSet<>();

        while(head != null){
            if(set.contains(head)){
                return head;
            }
            set.add(head);
            head=head.next;
        }
        return null;
    }
}
