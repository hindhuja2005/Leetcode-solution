class Solution:
    def findWinners(self, matches: List[List[int]]) -> List[List[int]]:
        a=[]
        b=[]
        h=[]
        for i in range(len(matches)):
            a.append(matches[i][0])
            b.append(matches[i][1])
        c=Counter(a)
        d=Counter(b)
        e=[i for i in c.keys() if i not in d.keys()]
        f=[i for i in d.keys() if d[i]==1]
        e.sort()
        f.sort()
        h.append(e)
        h.append(f)
        return h