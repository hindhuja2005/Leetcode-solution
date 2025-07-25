class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int max = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max = sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            max = Math.max(sum, max);
        }
        return (double) max/k;
    }
}