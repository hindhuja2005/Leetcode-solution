class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        a=[]
        for i in range(len(accounts)):
            c=0
            for j in range(len(accounts[i])):
                c=c+accounts[i][j]
            a.append(c)
        return max(a)