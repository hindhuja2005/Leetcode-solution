class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=nums[0];
        int max1=nums[0];
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        for(int i=1;i<n;i++){
            max1=nums[i]>nums[i-1]?max1+nums[i]:nums[i];
            max=Math.max(max,max1);
        }
        return max;
    }
}