class Solution:
    def minElement(self, nums: List[int]) -> int:
        for i in range(len(nums)):
            sum=0
            a=nums[i]
            while(a>0):
                b=a%10
                sum=sum+b
                a=a//10
            nums[i]=sum
        return min(nums)