class Solution:
    def countUnguarded(self, m: int, n: int, guards: List[List[int]], walls: List[List[int]]) -> int:
        g=[[0]*n for _ in range(m)]
        for x,y in guards:
            g[x][y]=2
        for x,y in walls:
            g[x][y]=2
        dirs=[(-1,0),(0,1),(1,0),(0,-1)]
        for gx,gy in guards:
            for dx,dy in dirs:
                x,y=gx,gy
                while True:
                    x+=dx
                    y+=dy
                    if x<0 or x>=m or y<0 or y>=n or g[x][y]==2:
                        break
                    g[x][y]=1
        return sum(row.count(0) for row in g)