class Solution:
    def stringSequence(self, target: str) -> List[str]:
        a=[]
        s=""
        for i in target:
            for j in range(ord("a"),ord(i)+1):
                 a.append(s+chr(j))
            s=s+i
        return a