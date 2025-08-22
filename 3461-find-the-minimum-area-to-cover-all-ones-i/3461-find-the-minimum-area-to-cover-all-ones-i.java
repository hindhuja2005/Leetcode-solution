class Solution {
    public int minimumArea(int[][] grid) {
        int minrow =grid.length,maxrow=-1,mincol=grid[0].length,maxcol=-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    minrow=Math.min(minrow,i);
                    mincol=Math.min(mincol,j);
                    maxrow=Math.max(maxrow,i);
                    maxcol=Math.max(maxcol,j);
                }
            }
        }
        return (maxrow-minrow+1)*(maxcol-mincol+1);
    }
}