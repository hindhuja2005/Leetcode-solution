class Solution:
    def minOperations(self, nums: List[int]) -> int:
        a=0
        for i in range(len(nums)-2):
            if nums[i]==0:
                a=a+1
                b=i
                for j in range(b,b+3):
                    if nums[j]==1:
                        nums[j]=0
                    else:
                        nums[j]=1
        for i in nums:
            if i==0:
                return -1
        return a