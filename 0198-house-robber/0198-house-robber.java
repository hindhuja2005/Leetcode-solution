class Solution {
    public int rob(int[] nums) {
        int prev2=0;
        int prev=nums[0];
        int cur=0;
        for(int i=1;i<nums.length;i++){
            int take=nums[i]+prev2;
            int nottake=prev;
            cur=Math.max(take,nottake);
            prev2=prev;
            prev=cur;
        }
        return prev;
    }
}