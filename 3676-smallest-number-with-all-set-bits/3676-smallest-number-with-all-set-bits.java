class Solution {
    public int smallestNumber(int n) {
        int a=0;
        int ans=0;
        while(true){
            ans=(int)Math.pow(2,a++)-1;
            if(ans>=n){
                break;
            }
        }
        return ans;
    }
}