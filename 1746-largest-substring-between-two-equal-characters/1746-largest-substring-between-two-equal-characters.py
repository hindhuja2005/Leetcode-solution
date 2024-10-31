class Solution:
    def maxLengthBetweenEqualCharacters(self, s: str) -> int:
        a=-1
        for i in range(len(s)):
            for j in range(i+1,len(s)):
                if s[i]==s[j]:
                    a=max(a,j-i-1)
        return a