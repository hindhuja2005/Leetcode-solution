class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        a=[]
        for n in nums1:
            if n in nums2:
                a.append(n)
                nums2.remove(n)
        return a