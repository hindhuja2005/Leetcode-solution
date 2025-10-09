class Solution {
    public int uniquePathsWithObstacles(int[][] o) {
        if(o[o.length-1][o[0].length-1]==1){
            return 0;
        }
        int dp[][]=new int[o.length][o[0].length];
        return path(o.length-1,o[0].length-1,o,dp);
    }
    public int path(int i,int j,int[][] o,int dp[][]){
        if(i>=0 && j>=0 && o[i][j]==1) return 0;
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]>0) return dp[i][j];
        int l=path(i,j-1,o,dp);
        int r=path(i-1,j,o,dp);
        dp[i][j]=l+r;
        return dp[i][j];
    }
}