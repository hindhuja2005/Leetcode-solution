class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxlength=0;
        for(int i=0;i<nums.length;i++){
            int curl=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[j-1]){
                    curl++;
                }
                else{
                    break;
                }
            }
            maxlength=Math.max(maxlength,curl);
        }
        for(int i=0;i<nums.length;i++){
            int curl=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[j-1]){
                    curl++;
                }
                else{
                    break;
                }
            }
            maxlength=Math.max(maxlength,curl);
        }
        return maxlength;
    }
}