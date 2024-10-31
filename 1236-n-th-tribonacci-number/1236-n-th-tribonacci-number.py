class Solution:
    def tribonacci(self, n: int) -> int:
        a=[0,1,1]
        if n==0:
            return 0
        elif n==1 or n==2:
            return 1
        for i in range(3,n+1):
            b=a[i-3]+a[i-2]+a[i-1]
            a.append(b)
        return a[len(a)-1]