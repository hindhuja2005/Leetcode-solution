class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;

        // Count total distinct elements
        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            unique.add(num);
        }
        int totalDistinct = unique.size();

        int count = 0;

        // Iterate with sliding start index
        for (int i = 0; i < n; i++) {
            int[] freq = new int[100001]; // constraint: nums[i] <= 10^5
            int distinct = 0;

            for (int j = i; j < n; j++) {
                if (freq[nums[j]] == 0) {
                    distinct++;
                }
                freq[nums[j]]++;

                if (distinct == totalDistinct) {
                    count++;
                }
            }
        }

        return count;
    }
}
