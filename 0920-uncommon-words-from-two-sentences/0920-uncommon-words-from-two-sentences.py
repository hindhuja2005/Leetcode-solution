class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        a=list(s1.split())
        b=list(s2.split())
        c=[]
        for i in a:
            if a.count(i)==1 and i not in b:
                c.append(i)
        for i in b:
            if b.count(i)==1 and i not in a:
                c.append(i)
        return c