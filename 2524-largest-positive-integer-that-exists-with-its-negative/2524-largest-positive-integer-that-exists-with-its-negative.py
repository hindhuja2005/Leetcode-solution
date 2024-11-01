class Solution:
    def findMaxK(self, nums: List[int]) -> int:
        while(len(nums)>0):
            a=max(nums)
            if -a in nums:
                return a
            else:
                nums.remove(a)
        return -1