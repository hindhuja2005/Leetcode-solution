class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        a=Counter(nums)
        b=[]
        for i in a.keys():
            if a[i]==1:
                b.append(i)
        return b
    