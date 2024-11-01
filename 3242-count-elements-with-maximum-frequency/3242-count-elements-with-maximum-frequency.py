class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        a=Counter(nums)
        b=max(list(a.values()))
        msum=0
        for i in a.values():
            if i==b:
                msum+=b
        return msum