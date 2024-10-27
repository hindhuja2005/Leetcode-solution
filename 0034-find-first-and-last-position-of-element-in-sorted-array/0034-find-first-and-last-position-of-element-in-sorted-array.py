class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        if target not in nums:
            return [-1,-1]
        a=[]
        for i in range(len(nums)):
            if nums[i]==target:
                a.append(i)
                break
        for i in range(len(nums)-1,-1,-1):
            if nums[i]==target:
                a.append(i)
                break
        return a