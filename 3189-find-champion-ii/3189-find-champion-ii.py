class Solution:
    def findChampion(self, n: int, edges: List[List[int]]) -> int:
        isundefeat=[True]*n
        for w,l in edges:
            isundefeat[l]=False
        champ=-1
        champcount=0
        for t in range(n):
            if isundefeat[t]:
                champ=t
                champcount+=1
        if champcount==1:
            return champ
        return -1