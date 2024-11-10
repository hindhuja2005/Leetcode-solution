class Solution:
    def smallestNumber(self, n: int, t: int) -> int:
        while True:
            n1=n
            res=1
            while n1>0:
                i=n1%10
                res=res*i
                n1=n1//10
            if res%t==0:
                return n
            n=n+1