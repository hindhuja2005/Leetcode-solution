class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        b=[]
        a=""
        for i in digits:
            a=a+str(i)
        a=int(a)+1
        for i in str(a):
            b.append(int(i))
        return b