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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy= new ListNode(-1);
        ListNode d1=list1;
        ListNode temp1=list1;
        
        
        int j=0;
        while(j<b){
            j++;
            d1=d1.next;
            
        }
        int i=0;
        while(i<a-1){
            i++;
            temp1=temp1.next;
            
        }
        
        temp1.next=list2;

        ListNode temp2=list2;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        
        temp2.next=d1.next;
        return list1;
    }
}