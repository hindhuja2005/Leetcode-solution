class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n=len(nums)/2
        a=Counter(nums)
        for i in a.keys():
            if a[i]>n:
                return i
