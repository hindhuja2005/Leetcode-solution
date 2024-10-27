class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        a=Counter(nums)
        for i in a.keys():
            if a[i]>=2:
                return i