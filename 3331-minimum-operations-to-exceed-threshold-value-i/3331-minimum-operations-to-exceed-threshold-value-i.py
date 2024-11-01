class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        a=min(nums)
        c=0
        while a<k:
            c=c+1
            nums.remove(a)
            a=min(nums)
        return c