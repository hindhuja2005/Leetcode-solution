class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        res=[]
        for i in range(len(A)):
            count=0
            for j in range(i+1):
                if A[j] in B[:i+1]:
                    count=count+1
            res.append(count)
        return res