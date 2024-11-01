class Solution:
    def minimumLength(self, s: str) -> int:
        a=Counter(s)
        for i in a.keys():
            while a[i]>2:
                a[i]=a[i]-2
        ans=0
        for j in a.values():
            ans=ans+j
        return ans
