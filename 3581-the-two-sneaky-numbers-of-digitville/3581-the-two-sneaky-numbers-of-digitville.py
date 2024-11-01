class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        a=Counter(nums)
        b=[]
        for i in a.keys():
            if a[i]==2:
                b.append(i)
        return b