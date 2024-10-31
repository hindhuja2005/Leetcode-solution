class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        a=[]
        b=Counter(nums)
        for i in b.keys():
            if b[i]==2:
                a.append(i)
        return a