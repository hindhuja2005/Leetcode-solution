class Solution {
    public boolean isPowerOfThree(int n) {
        int high=n/3;
        int low=1;
        if(n==1){
            return true;
        }
        while(low<=high){
            int mid=(low+high)/2;
            double i=Math.pow(3,mid);
            if(i==n){
                return true;
            }
            else if(i<n){
                if(Math.pow(3,mid+1)>n){
                    return false;
                }
                else{
                    low=mid;
                }
            }
            else{
                high=mid;
            }
        }
        return false;
    }
}