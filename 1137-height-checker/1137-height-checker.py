class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        e=heights.copy()
        heights.sort()
        s=0
        for i in range(len(heights)):
            if e[i]!=heights[i]:
                s=s+1
        return s