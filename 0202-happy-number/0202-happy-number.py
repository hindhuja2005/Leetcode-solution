class Solution:
    def isHappy(self, n: int) -> bool:
        visit=set()
        def nextnum(n):
            output=0
            while n:
                d=n%10
                output+=d**2
                n=n//10
            return output
        while n not in visit:
            visit.add(n)
            n=nextnum(n)
            if n==1:
                return True
        return False