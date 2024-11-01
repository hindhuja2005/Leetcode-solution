class Solution:
    def possibleStringCount(self, word: str) -> int:
        c=1
        for i in range(1,len(word)):
            if word[i]==word[i-1]:
                c+=1
        return c