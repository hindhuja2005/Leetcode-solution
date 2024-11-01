class Solution:
    def minGroups(self, intervals: List[List[int]]) -> int:
        s=sorted([i[0] for i in intervals])
        e=sorted([i[1] for i in intervals])
        ptr,grp=0,0
        for i in s:
            if i>e[ptr]:
                ptr+=1
            else:
                grp+=1
        return grp