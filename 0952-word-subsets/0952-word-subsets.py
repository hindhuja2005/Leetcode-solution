class Solution:
    def wordSubsets(self, words1: List[str], words2: List[str]) -> List[str]:
        res=[]
        a=Counter()
        for i in words2:
            cur=Counter(i)
            for j in cur:
                a[j]=max(a[j],cur[j])
        for i in words1:
            cur=Counter(i)
            if all(cur[ch]>=a[ch] for ch in a):
                res.append(i)
        return res