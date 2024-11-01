class Solution:
    def occurrencesOfElement(self, nums: List[int], queries: List[int], x: int) -> List[int]:
        a=[i for i in range(len(nums)) if nums[i]==x]
        r=[]
        for j in queries:
            if j>len(a):
                r.append(-1)
            else:
                r.append(a[j-1])
        return r