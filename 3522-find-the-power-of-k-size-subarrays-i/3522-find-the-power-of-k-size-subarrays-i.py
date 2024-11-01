class Solution:
    def resultsArray(self, nums: List[int], k: int) -> List[int]:
        a=[]
        for i in range(len(nums)-k+1):
            b=nums[i:i+k]
            c=b[0]
            flag=True
            for j in range(1,k):
                if c+1==b[j]:
                    c=c+1
                else:
                    flag=False
            if flag==True:
                a.append(max(b))
            else:
                a.append(-1)
        return a
                