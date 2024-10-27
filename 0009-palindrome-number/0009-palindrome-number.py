class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x<0:
            return False
        a=0
        temp=x
        while temp!=0:
            d=temp%10
            a=a*10+d
            temp=temp//10
        return a==x