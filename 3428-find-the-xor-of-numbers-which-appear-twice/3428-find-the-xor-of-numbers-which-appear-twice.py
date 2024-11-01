class Solution:
    def duplicateNumbersXOR(self, nums: List[int]) -> int:
        a=Counter(nums)
        r=0
        for i in list(a.keys()):
            if a[i]==2:
                r=r^i
        return r