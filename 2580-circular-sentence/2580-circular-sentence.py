class Solution:
    def isCircularSentence(self, sentence: str) -> bool:
        a=sentence.split()
        for i in range(len(a)-1):
            if (a[i][-1])!=(a[i+1][0]):
                return False
        if a[0][0]!=a[-1][-1]:
            return False
        return True