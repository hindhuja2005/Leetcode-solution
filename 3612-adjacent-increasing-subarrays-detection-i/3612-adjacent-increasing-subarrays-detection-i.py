class Solution:
    def hasIncreasingSubarrays(self, nums: List[int], k: int) -> bool:
        for i in range(len(nums)-k-k+1):
            a=nums[i:i+k]
            b=nums[i+k:i+k+k]
            flag=True
            for j in range(k-1):
                if a[j]>=a[j+1] or b[j]>=b[j+1]:
                    flag=False
                    break
            if flag==True:
                return True
        return False