class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        a=Counter(nums)
        for i in a.values():
            if i>1:
                return True
        return False