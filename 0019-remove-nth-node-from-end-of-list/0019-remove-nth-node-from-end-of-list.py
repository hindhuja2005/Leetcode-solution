# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        temp=head
        temp1=head
        for i in range(n):
            temp=temp.next
        if not temp:
            return head.next
        while temp.next:
            temp=temp.next
            temp1=temp1.next
        temp1.next=temp1.next.next
        return head