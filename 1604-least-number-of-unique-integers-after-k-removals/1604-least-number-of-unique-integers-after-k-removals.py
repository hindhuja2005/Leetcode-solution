class Solution:
    def findLeastNumOfUniqueInts(self, arr: List[int], k: int) -> int:
        a=Counter(arr)
        b=list(a.keys())
        c=list(a.values())
        c.sort()
        cnt=0
        for i in c:
            if i<=k:
                cnt=cnt+1
                k=k-i
            else:
                break
        return len(b)-cnt