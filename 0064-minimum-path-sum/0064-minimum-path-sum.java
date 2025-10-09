class Solution {
    public int minPathSum(int[][] grid) {
        int dp[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0 && j==0) dp[i][j]=grid[0][0];
                else{
                    int l=Integer.MAX_VALUE,u=Integer.MAX_VALUE;
                    if(j>0)
                    l=grid[i][j]+dp[i][j-1];
                    if(i>0)
                    u=grid[i][j]+dp[i-1][j];
                    dp[i][j]=Math.min(l,u);
                }
            }
        }
        return dp[grid.length-1][grid[0].length-1];
        //return path(grid.length-1,grid[0].length-1,grid,dp);
    }
    /*public int path(int i,int j,int[][] g,int[][] dp){
        if(i==0 && j==0) return g[0][0];
        if(i<0 ||j<0){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=0) return dp[i][j];
        int l=Integer.MAX_VALUE,u=Integer.MAX_VALUE;
        if(j>0){
            l=g[i][j]+path(i,j-1,g,dp);
        }
        if(i>0){
            u=g[i][j]+path(i-1,j,g,dp);
        }
        dp[i][j]=Math.min(l,u);
        return dp[i][j];
    }*/
}