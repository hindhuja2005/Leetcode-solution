class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int arr[]=new int[nums.length];
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]<pivot){
                arr[i++]=nums[j];
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]==pivot){
                arr[i++]=nums[j];
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]>pivot){
                arr[i++]=nums[j];
            }
        }
        return arr;
    }
}