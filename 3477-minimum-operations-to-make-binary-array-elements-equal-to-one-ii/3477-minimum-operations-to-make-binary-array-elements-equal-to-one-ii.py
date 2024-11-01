class Solution:
    def minOperations(self, nums: List[int]) -> int:
        a=0
        for i in nums:
            if i==0:
                if a%2==0:
                    a+=1
            else:
                if a%2==1:
                    a+=1
        return a