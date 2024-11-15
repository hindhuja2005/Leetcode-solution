class Solution:
    def findLengthOfShortestSubarray(self, arr: List[int]) -> int:
        n = len(arr)
        right = n - 1
        while right > 0 and arr[right - 1] <= arr[right]:
            right -= 1
        if right == 0:
            return 0
        min_length = right
        for left in range(n):
            if left > 0 and arr[left - 1] > arr[left]:
                break
            while right < n and arr[left] > arr[right]:
                right += 1
            current_length = right - left - 1
            min_length = min(min_length, current_length)
            
        return min_length