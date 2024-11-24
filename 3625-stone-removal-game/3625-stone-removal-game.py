class Solution:
    def canAliceWin(self, n: int) -> bool:
        if n<10:
            return False
        a=10
        b=1
        while n>=a:
            n=n-a
            a=a-1
            b=b+1
        if b%2==0:
            return True
        return False