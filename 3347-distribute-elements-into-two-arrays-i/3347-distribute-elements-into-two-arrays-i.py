class Solution:
    def resultArray(self, nums: List[int]) -> List[int]:
        arr1=[]
        arr2=[]
        arr1.append(nums.pop(0))
        arr2.append(nums.pop(0))
        while len(nums)>0:
            if arr1[len(arr1)-1]>arr2[len(arr2)-1]:
                arr1.append(nums.pop(0))
            else:
                arr2.append(nums.pop(0))
        arr1.extend(arr2)
        return arr1