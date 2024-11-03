class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        for i in range(0,len(s)):
            if s[i:len(s)]+s[0:i]==goal:
                return True
        return False