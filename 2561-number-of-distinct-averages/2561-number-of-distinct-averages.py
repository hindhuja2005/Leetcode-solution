class Solution:
    def distinctAverages(self, nums: List[int]) -> int:
        a=[]
        nums.sort()
        while len(nums)>0:
            b=nums.pop(0)
            c=nums.pop(len(nums)-1)
            d=(b+c)/2
            if d not in a:
                a.append(d)
        return len(a)