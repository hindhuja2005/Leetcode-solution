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
    public ListNode insertionSortList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode temp=new ListNode(0);
        ListNode prev=temp;
        while(head!=null){
            ListNode t=head.next;
            if(prev.val>=head.val)
            prev=temp;
            while(prev.next!=null && prev.next.val<head.val){
                prev=prev.next;
            }
            head.next=prev.next;
            prev.next=head;
            head=t;
        }
        return temp.next;
    }
}