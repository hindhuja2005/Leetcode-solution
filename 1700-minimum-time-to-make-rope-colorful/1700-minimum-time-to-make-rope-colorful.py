class Solution:
    def minCost(self, colors: str, neededTime: List[int]) -> int:
        a=0
        c=neededTime[0]
        for i in range(1,len(colors)):
            if(colors[i-1]==colors[i]):
                a+=min(neededTime[i],c)
                c=max(neededTime[i],c)
            else:
                c=neededTime[i]
        return a
                