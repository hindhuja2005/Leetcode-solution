class Solution:
    def addBinary(self, a: str, b: str) -> str:
        a1=int(a,2)
        a2=int(b,2)
        a1=a1+a2
        return format(a1,'b')