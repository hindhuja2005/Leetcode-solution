class Solution:
    def maxScore(self, nums: List[int]) -> int:
        res=0
        for i in range(-1,len(nums)):
            d,m=0,1
            for j in range(len(nums)):
                if j!=i:
                    d= gcd(d,nums[j])
                    m=lcm(m,nums[j])
            res=max(res,d*m)
        return res

