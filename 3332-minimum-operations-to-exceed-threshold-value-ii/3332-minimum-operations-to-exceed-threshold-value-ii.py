class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        minHeap=nums.copy()
        heapify(minHeap)
        count=0
        while minHeap[0]<k:
            x=heapq.heappop(minHeap)
            y=heapq.heappop(minHeap)
            a=2*x+y
            heapq.heappush(minHeap,a)
            count+=1
        return count