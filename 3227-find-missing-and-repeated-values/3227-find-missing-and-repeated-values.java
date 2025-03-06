class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[]=new int[2];
        int fre[]=new int[grid.length*grid.length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                fre[grid[i][j]-1]++;
            }
        }
        for(int i=0;i<fre.length;i++){
            if(fre[i]==2){
                ans[0]=i+1;
            }
            else if(fre[i]==0){
                ans[1]=i+1;
            }
        }
        return ans;
    }
}