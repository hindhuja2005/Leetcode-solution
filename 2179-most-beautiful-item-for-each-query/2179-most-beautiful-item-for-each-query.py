class Solution(object):
    def maximumBeauty(self, items, queries):
        items.sort()
        queries=[(q,i) for i,q in enumerate(queries)]
        queries.sort()
        max_b=0
        res=[0]*len(queries)
        j=0
        for q,i in queries:
            while j<len(items) and items[j][0]<=q:
                max_b=max(max_b,items[j][1])
                j+=1
            res[i]=max_b
        return res