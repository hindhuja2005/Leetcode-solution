class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        n=0
        for i in range(len(arr)):
            if arr[i]%2!=0:
                n=n+1
                if n==3:
                    return True
            else:
                n=0
        return False