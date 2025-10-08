class Solution {
    public int rob1(int[] nums) {
        if(nums.length==0){
            return 0;
        }
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
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int nums1[]=new int[nums.length-1];
        int nums2[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i!=0) nums1[i-1]=nums[i];
            if(i!=nums.length-1) nums2[i]=nums[i];
        }
        if(nums.length==1){
            nums2[0]=nums[0];
        }
        return Math.max(rob1(nums1),rob1(nums2));
    }
}