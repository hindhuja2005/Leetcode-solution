class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=(nums.length/2);
        int l=Integer.MIN_VALUE;
        for(int i:nums){
            l=Math.max(l,i);
        }
        int ans[]=new int[l+1];
        for(int i:nums){
            ans[i]++;
        }
        int res=0;
        for(int i=0;i<l+1;i++){
            if(ans[i]==n){
                res=i;
                break;
            }
        }
        return res;
    }
}