class Solution:
    def getMaximumXor(self, nums: List[int], maximumBit: int) -> List[int]:
        xor=0
        for i in nums:
            xor^=i
        
        m=(1<<maximumBit)-1
        answer=[]
        for i in reversed(nums):
            answer.append(xor^m)
            xor^=i
        return answer
