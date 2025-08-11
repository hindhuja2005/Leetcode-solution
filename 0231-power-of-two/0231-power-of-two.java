class Solution {
    public boolean isPowerOfTwo(int n) {
        int right=(n/2)+1;
        int left=0;
        while(left<=right){
            int mid=(left+right)/2;
            if (Math.pow(2,mid)==n){
                return true;
            }
            else if(Math.pow(2,mid)<n){
                if(Math.pow(2,mid+1)>n){
                    return false;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
}