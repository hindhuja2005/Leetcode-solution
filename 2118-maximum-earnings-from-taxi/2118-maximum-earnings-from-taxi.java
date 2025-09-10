class Solution {
    public long maxTaxiEarnings(int n, int[][] rides) {
        /*Arrays.sort(rides, (a, b) -> a[0] - b[0]);
        return backtrack(n,1, rides, 0);
    }

    private int backtrack(int n,int position, int[][] rides, int index) {
        if (position > n || index == rides.length) {
            return 0;
        }

        int maxProfit = 0;

        for (int i = index; i < rides.length; i++) {
            int start = rides[i][0];
            int end = rides[i][1];
            int tip = rides[i][2];

            if (start >= position) {
                // Pick the ride
                int currentProfit = (end - start + tip) + backtrack(n,end, rides, i + 1);

                // Skip the ride
                int skipProfit = backtrack(n,position, rides, i + 1);

                maxProfit = Math.max(maxProfit, Math.max(currentProfit, skipProfit));
            }
        }

        return maxProfit;*/
        Arrays.sort(rides, (a, b) -> a[1] - b[1]);

        long[] dp = new long[n + 1];
        int rideIndex = 0;
        int m = rides.length;

        for (int i = 1; i <= n; i++) {
            // By default, carry over previous maximum
            dp[i] = Math.max(dp[i], dp[i - 1]);

            // Process all rides ending at position i
            while (rideIndex < m && rides[rideIndex][1] == i) {
                int start = rides[rideIndex][0];
                int end = rides[rideIndex][1];
                int tip = rides[rideIndex][2];

                long profit = (end - start + tip);

                // Update dp[i] considering taking this ride
                dp[i] = Math.max(dp[i], dp[start] + profit);

                rideIndex++;
            }
        }

        return dp[n];

    }
}