class Solution {
    public boolean partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int f[]=new int[nums[nums.length-1]+1];
        for(int a:nums){
            f[a]++;
        }
        int group=nums.length/k;
        if(nums.length%k!=0){
            return false;
        }
        for(int a:nums){
            if(f[a]>group){
                return false;
            }
        }
        return true;
    }
}