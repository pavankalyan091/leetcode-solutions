/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur=head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }

        if (n == count) {
            return head.next;
        }

        int size=count-n;
        int i=1;
        ListNode curr=head;
        
        while(i<size){
            curr=curr.next;
            i++;
        }
        curr.next=curr.next.next;
        return head;
    }
}