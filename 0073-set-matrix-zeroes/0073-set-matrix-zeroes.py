class Solution:
    def setZeroes(self, m: List[List[int]]) -> None:
        r=len(m)
        c=len(m[0])
        row=[]
        col=[]
        for i in range(r):
            for j in range(c):
                if m[i][j]==0:
                    row.append(i)
                    col.append(j)
        for i in row:
            for j in range(c):
                m[i][j]=0
        for i in col:
            for j in range(r):
                m[j][i]=0