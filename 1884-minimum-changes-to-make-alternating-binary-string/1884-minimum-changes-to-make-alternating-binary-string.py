class Solution:
    def minOperations(self, s: str) -> int:
        c=0
        s0=0
        s1=0
        for i in range(0,len(s)):
            if i%2==0:
                if s[i]=="1":
                    s0+=1
            else:
                if s[i]=="0":
                    s0+=1
        return min(s0,len(s)-s0)