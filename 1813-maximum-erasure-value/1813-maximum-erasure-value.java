class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int currentsum = nums[0];
        int maxsum = nums[0];
        int right = 1, left = 0;
        int[] f = new int[10001];
        Arrays.fill(f, -1); // initialize with -1
        f[nums[0]] = 0;

        while (right < nums.length) {
            if (f[nums[right]] >= left) {
                // Remove sum from left to last index of duplicate
                for (int j = left; j <= f[nums[right]]; j++) {
                    currentsum -= nums[j];
                }
                left = f[nums[right]] + 1;
            }
            currentsum += nums[right];
            f[nums[right]] = right;
            maxsum = Math.max(maxsum, currentsum);
            right++;
        }
        return maxsum;
    }
}