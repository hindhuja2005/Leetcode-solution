class Solution:
    def findPermutationDifference(self, s: str, t: str) -> int:
        a=[]
        for i in s:
            b=s.index(i)-t.index(i)
            a.append(abs(b))
        return sum(a)