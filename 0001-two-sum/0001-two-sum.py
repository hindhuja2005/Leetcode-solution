class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            c=nums[i]
            for j in range(i+1,len(nums)):
                b=nums[j]
                if c+b==target:
                    a=[i,j]
                    return a