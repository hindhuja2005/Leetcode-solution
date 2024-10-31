class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        a=Counter(arr)
        b=[i for i in a.values()]
        for i in range(len(b)-1):
            for j in range(i+1,len(b)):
                if b[i]==b[j]:
                    return False
        return True
