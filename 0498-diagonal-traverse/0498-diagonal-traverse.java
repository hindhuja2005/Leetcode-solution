class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int ans[]=new int[n*m];
        boolean order=true;
        int k=0;
        for(int i=0;i<m;i++){
            int j=0;
            if(i==0 && j==0){
                ans[k++]=mat[i][j];
                continue;
            }
            ArrayList<Integer> l=new ArrayList<>();
            for(int t=i;t>=0;t--){
                if(t<m && j<n)
                l.add(mat[j++][t]);
            }
            if(!order){
                Collections.reverse(l);
            }
            order=!order;
            for(int a:l){
                ans[k++]=a;
            }
        }
        for(int i=1;i<n;i++){
            int j=m-1;
            if(i==n-1 && j==m-1){
                ans[k++]=mat[i][j];
                break;
            }
            ArrayList<Integer> l=new ArrayList<>();
            for(int t=i;t<n;t++){
                if(t<n && j>=0)
                l.add(mat[t][j--]);
            }
            if(!order){
                Collections.reverse(l);
            }
            order=!order;
            for(int a:l){
                ans[k++]=a;
            }
        }
        return ans;
    }
}