class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        else:
            flag=True
            for i in range(len(s)):
                if s[i] in t:
                    if s.count(s[i])!=t.count(s[i]):
                        flag=False
                else:
                    return False
            if flag==True:
                return True
            else:
                return False
                    