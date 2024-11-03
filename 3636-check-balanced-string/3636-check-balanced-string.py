class Solution:
    def isBalanced(self, num: str) -> bool:
        e,o=0,0
        for i in range(0,len(num),2):
            o=o+int(num[i])
        for j in range(1,len(num),2):
            e=e+int(num[j])
        if e==o:
            return True
        return False