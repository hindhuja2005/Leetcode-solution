class Solution {
    public int triangularSum(int[] nums) {
        /*if(nums.length==1){
            return nums[0];
        }
        int newnums[]=new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            newnums[i]=(nums[i]+nums[i+1])%10;
        }
        return triangularSum(newnums);
        */
        int n = nums.length;
        
        for (int size = n; size > 1; size--) {
            for (int i = 0; i < size - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
        }

        return nums[0];
    }
}