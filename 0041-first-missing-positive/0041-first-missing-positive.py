class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        if max(nums)<0:
            return 1
        else:
            l=set(nums)
            for i in range(1,max(nums)):
                if i not in l:
                    return i
                else:
                    l.remove(i)
            return max(nums)+1