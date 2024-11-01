class Solution:
    def largestPerimeter(self, nums: List[int]) -> int:
        nums.sort()
        sum=nums[0]
        ans=-1
        c=1
        for i in range(1,len(nums)):
            c=c+1
            if nums[i]<sum:
                ans=sum+nums[i]
            sum=sum+nums[i]
        return ans
        