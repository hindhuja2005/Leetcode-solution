class Solution:
    def pivotInteger(self, n: int) -> int:
        for i in range(1,n+1):
            if sum([j for j in range(1,i+1)])==sum([k for k in range(i,n+1)]):
                return i
        return -1