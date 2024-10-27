# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        while head is not None and head.val==val:
            head=head.next
        prev=None
        current=head
        while current!=None:
            if current.val==val:
                if prev is not None:
                    prev.next=current.next
                current=current.next
            else:
                prev=current
                current=current.next
        return head