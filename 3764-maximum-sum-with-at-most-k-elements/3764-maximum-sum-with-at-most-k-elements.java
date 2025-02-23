class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        if(k==0){
            return 0;
        }
        //int a[]=new int[Arrays.stream(limits).sum()];
        PriorityQueue <Integer> a=new PriorityQueue<>();
        int index=0;
        for(int i=0;i<grid.length;i++){
            Arrays.sort(grid[i]);
            for(int j=0;j<limits[i];j++){
                //a[index++]=grid[i][grid[i].length-1-j];
                a.add(-1*grid[i][grid[i].length-1-j]);
            }
        }
        long sum=0;
        for(int i=0;i<k&& !a.isEmpty();i++){
            sum+=-1*a.poll();
        }
        return sum;
    }
}