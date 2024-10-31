class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        a=[]
        for i in range(len(nums)):
            b=0
            for j in range(i+1):
                b=b+nums[j]
            a.append(b)
        return a