class Solution {
    public int uniquePaths(int m, int n) {
        int p[][]=new int[m][n];
        return Paths(m-1,n-1,p); 
    }
    public int Paths(int m,int n, int[][] p){
        if(m==0 && n==0){
            return 1;
        }
        if(m<0 || n<0){
            return 0;
        }
        if(p[m][n]!=0) return p[m][n];
        int l=Paths(m,n-1,p);
        int r=Paths(m-1,n,p);
        p[m][n]=l+r;
        return p[m][n];
    }
}