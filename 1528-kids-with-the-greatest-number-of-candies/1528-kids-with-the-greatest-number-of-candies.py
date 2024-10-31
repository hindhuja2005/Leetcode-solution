class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        ans=[]
        a=max(candies)
        for i in range(len(candies)):
            if (candies[i]+extraCandies)<a:
                ans.append(False)
            else:
                ans.append(True)
        return ans