class Solution:
    def finalPositionOfSnake(self, n: int, commands: List[str]) -> int:
        a=[0,0]
        for i in commands:
            if i=="RIGHT":
                a[1]=a[1]+1
            elif i=="LEFT":
                a[1]=a[1]-1
            elif i=="DOWN":
                a[0]=a[0]+1
            else:
                a[0]=a[0]-1
        return (a[0]*n)+a[1]