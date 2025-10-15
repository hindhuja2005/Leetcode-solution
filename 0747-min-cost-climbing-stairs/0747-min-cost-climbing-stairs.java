class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            if(i<2) dp[i]=cost[i];
            else dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
        //return Math.min(f(i-1,cost,dp),f(i-2,cost,dp));
    }
    /*public int f(int i,int c[],int dp[]){
        if(i==0||i==1){
            return c[i];
        }
        if(i<=-1){
            return 0;
        }
        if(dp[i]!=0) return dp[i];
        dp[i]=c[i]+Math.min(f(i-1,c,dp),f(i-2,c,dp));
        return dp[i];
    }*/
}