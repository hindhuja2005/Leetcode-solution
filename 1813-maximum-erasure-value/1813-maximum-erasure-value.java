class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int currentsum=nums[0];
        int maxsum=nums[0];
        int right=1,left=0;;
        int f[]=new int[10001];
        Arrays.fill(f, -1); // initialize with -1
        f[nums[0]] = 0;
        while(right<nums.length){
            if(f[nums[right]]>=left){
                for(int j=left;j<=f[nums[right]];j++){
                    currentsum-=nums[j];
                }
                left=f[nums[right]]+1;
            }
            f[nums[right]]=right;
            currentsum+=nums[right++];
            if (currentsum > maxsum) {
                maxsum = currentsum;
            }
        }
        return maxsum;
    }
}