class Solution:
    def minimumAverage(self, nums: List[int]) -> float:
        a=[]
        nums.sort()
        while len(nums)>0:
            b=nums.pop(0)
            c=nums.pop(len(nums)-1)
            d=(b+c)/2
            a.append(d)
        return min(a)