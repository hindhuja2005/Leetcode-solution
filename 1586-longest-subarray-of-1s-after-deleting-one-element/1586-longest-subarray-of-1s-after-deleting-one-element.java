class Solution {
    public int longestSubarray(int[] nums) {
        int zc=0;
        int lw=0;
        int start=0;
        for(int i=0;i<nums.length;i++){
            zc+=(nums[i]==0?1:0);
            while(zc>1){
                zc-=(nums[start]==0?1:0);
                start++;
            }
            lw=Math.max(lw,i-start);
        }
        return lw;
    }
}