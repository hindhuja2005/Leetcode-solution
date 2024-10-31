class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        a=Counter(arr1)
        ans=[]
        for i in arr2:
            for j in range(a[i]):
                ans.append(i)
        ans1=[]
        for i in a.keys():
            if i not in arr2:
                for j in range(a[i]):
                    ans1.append(i)
        ans1.sort()
        return ans+ans1