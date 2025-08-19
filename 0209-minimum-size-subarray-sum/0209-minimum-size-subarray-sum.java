class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int minlength=nums.length+1;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(left<nums.length && sum>=target){
                minlength=Math.min(minlength,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return (minlength==nums.length+1)?0:minlength;
    }
}