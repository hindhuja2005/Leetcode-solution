class Solution:
    def fib(self, n: int) -> int:
        a=[0,1,1]
        if n==0:
            return 0
        elif n==1 or n==2:
            return 1
        for i in range(3,n+1):
            a.append(a[i-2]+a[i-1])
        return a[len(a)-1]