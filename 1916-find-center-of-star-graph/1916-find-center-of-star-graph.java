class Solution {
    public int findCenter(int[][] edges) {
        int f[]=new int[edges.length+2];
        for(int i=0;i<edges.length;i++){
            f[edges[i][0]]++;
            f[edges[i][1]]++;
            if(f[edges[i][0]]>1){
                return edges[i][0];
            }
            else if(f[edges[i][1]]>1){
                return edges[i][1];
            }
        }
        return 0;
    }
}