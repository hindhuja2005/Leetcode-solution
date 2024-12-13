class Solution:
    def findScore(self, nums: List[int]) -> int:
        score=0
        n=len(nums)
        min_heap=[(num,i) for i,num in enumerate(nums)]
        heapq.heapify(min_heap)
        while min_heap:
            num,idx=heapq.heappop(min_heap)
            if nums[idx]!=-1:
                score+=num
                nums[idx]=-1
                if idx>0 and nums[idx-1]!=-1:
                    nums[idx-1]=-1
                if idx<n-1 and nums[idx+1]!=-1:
                    nums[idx+1]=-1
        return score