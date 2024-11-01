class Solution:
    def getCommon(self, nums1: List[int], nums2: List[int]) -> int:
        if len(nums1)>len(nums2):
            nums1,nums2=nums2,nums1
        a=set(nums2)
        for i in nums1:
            if i in a:
                return i
        return -1