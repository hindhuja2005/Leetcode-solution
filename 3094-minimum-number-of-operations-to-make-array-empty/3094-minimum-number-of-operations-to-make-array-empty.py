class Solution:
    def minOperations(self, nums: List[int]) -> int:
        count=0
        ans=Counter(nums)
        for i in ans.values():
            if i==1:
                return -1
            else:
                count=count+ceil(i/3)
        return count