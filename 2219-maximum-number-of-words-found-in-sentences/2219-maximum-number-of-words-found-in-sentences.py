class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        a=[]
        for i in sentences:
            c=1
            for j in i:
                if j==" ":
                    c=c+1
            a.append(c)
        return max(a)