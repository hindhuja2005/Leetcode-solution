class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        a=len(s)//2
        b=s[:a]
        c=s[a:]
        def count1(s1):
            v=['a','e','i','o','u','A','E','I','O','U']
            c3=0
            for i in s1:
                if i in v:
                    c3=c3+1
            return c3
        c1=count1(b)
        c2=count1(c)
        return c1==c2