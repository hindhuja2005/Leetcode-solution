class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums1.extend(nums2)
        nums1.sort()
        a=len(nums1)
        if a%2!=0:
            b=(a)//2
            return nums1[b]
        else:
            b=(a)//2
            c=b-1
            return (nums1[b]+nums1[c])/2