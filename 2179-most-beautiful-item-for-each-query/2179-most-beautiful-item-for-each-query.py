class Solution:
    def maximumBeauty(self, items: List[List[int]], queries: List[int]) -> List[int]:
        ans=[]
        items=sorted(items,key=lambda x:x[1],reverse=True)
        for i in queries:
            for j in items:
                if j[0]<=i:
                    ans.append(j[1])
                    break
            else:
                ans.append(0)
        return ans