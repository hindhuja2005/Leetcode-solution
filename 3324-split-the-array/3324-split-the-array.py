class Solution:
    def isPossibleToSplit(self, nums: List[int]) -> bool:
        a=Counter(nums)
        for i in a.values():
            if i>2:
                return False
        return True