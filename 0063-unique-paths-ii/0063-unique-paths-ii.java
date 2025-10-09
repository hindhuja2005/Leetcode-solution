class Solution {
    public int uniquePathsWithObstacles(int[][] o) {
        if(o[o.length-1][o[0].length-1]==1){
            return 0;
        }
        /*int dp[][]=new int[o.length][o[0].length];
        for(int i=0;i<o.length;i++){
            for(int j=0;j<o[0].length;j++){
                if(i>=0 && j>=0 &&o[i][j]==1){
                    continue;
                }
                if(i==0 && j==0){
                    dp[i][j]=1;
                }
                else {
                    int down=(i>0)?dp[i-1][j]:0;
                    int right=(j>0)?dp[i][j-1]:0;
                    dp[i][j]=down+right;
                }
            }
        }*/
        int dp[]=new int[o[0].length];
        for(int i=0;i<o.length;i++){
            int temp[]=new int[o[0].length];
            for(int j=0;j<o[0].length;j++){
                if(i>=0 && j>=0 &&o[i][j]==1){
                    continue;
                }
                if(i==0 && j==0){
                    temp[j]=1;
                }
                else {
                    int down=(i>0)?dp[j]:0;
                    int right=(j>0)?temp[j-1]:0;
                    temp[j]=down+right;
                }
            }
            dp=temp;
        }
        return dp[o[0].length-1];
       // return path(o.length-1,o[0].length-1,o,dp);
    }
   /* public int path(int i,int j,int[][] o,int dp[][]){
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
    }*/
}