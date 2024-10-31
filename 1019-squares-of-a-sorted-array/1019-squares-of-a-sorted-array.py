class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        a=[i*i for i in nums]
        a.sort()
        return a