class Solution {
    public int[] getNoZeroIntegers(int n) {
        int ans[]=new int[2];
        for(int i=1;i<=n-1;i++){
            int a=i,b=n-i;
            while(a>0||b>0){
                if(a>0){
                    int r=a%10;
                    if(r==0) break;
                    a=a/10;
                }
                if(b>0){
                    int r=b%10;
                    if(r==0) break;
                    b=b/10;
                }
                //System.out.println(a+" "+b);
            }
            if(a==0 && b==0){
                ans[0]=i;
                ans[1]=n-i;
                break;
            }
        }
        //System.out.println(ans[0]+" "+ans[1]);
        return ans;
    }
}