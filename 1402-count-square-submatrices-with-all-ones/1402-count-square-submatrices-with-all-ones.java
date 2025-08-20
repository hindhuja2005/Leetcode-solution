class Solution {
    public int countSquares(int[][] matrix) {
        int count=0;
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==1){
                    count++;
                }
                int n1=i,m1=j;
                while(true){
                    n1=n1+1;
                    m1=m1+1;
                    if(n1>=n || m1>=m){
                        break;
                    }
                    boolean flag1=true;
                    for(int k=i;k<=n1;k++){
                        boolean flag=true;
                        for(int l=j;l<=m1;l++){
                            if(matrix[k][l]==0){
                                flag=false;
                                break;
                            }
                        }
                        if(!flag){
                            flag1=false;
                            break;
                        }
                    }
                    if(flag1) count++;
                }
            }
        }
        return count;
    }
}