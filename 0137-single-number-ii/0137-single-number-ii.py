class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        a=Counter(nums)
        for i in list(a.keys()):
            if a[i]==1:
                return i