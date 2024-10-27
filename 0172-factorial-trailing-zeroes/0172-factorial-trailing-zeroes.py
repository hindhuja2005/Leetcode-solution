class Solution:
    def trailingZeroes(self, n: int) -> int:
        if n==0:
            return 0
        fact=1
        for i in range(1,n+1):
            fact=fact*i
        a=0
        while fact%10==0:
            a=a+1
            fact=fact//10
        return a