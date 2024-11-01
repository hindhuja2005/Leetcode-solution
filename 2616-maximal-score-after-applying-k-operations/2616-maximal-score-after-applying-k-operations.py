class Solution:
    def maxKelements(self, nums: List[int], k: int) -> int:
        s=0
        maxHeap=[-i for i in nums]
        heapify(maxHeap)
        for i in range(k):
            a=-heappop(maxHeap)
            s=s+a
            heappush(maxHeap,-ceil(a/3))
        return s