class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        a=Counter(nums)
        b=[]
        for i in a.keys():
            if a[i]==2:
                b.append(i)
                break
        for i in range(1,len(nums)+1):
            if i not in nums:
                b.append(i)
                break
        return b