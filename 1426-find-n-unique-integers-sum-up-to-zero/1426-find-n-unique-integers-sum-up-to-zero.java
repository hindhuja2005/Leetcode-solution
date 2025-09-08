class Solution {
    public int[] sumZero(int n) {
        int res[]=new int[n];
        int j=0,i=1;
        if(n%2!=0){
            res[0]=0;
            j=1;
        }

        for(j=j;j<n;j=j+2){
            res[j]=i;
            res[j+1]=i*-1;
            i++;
        }
        return res;
    }
}