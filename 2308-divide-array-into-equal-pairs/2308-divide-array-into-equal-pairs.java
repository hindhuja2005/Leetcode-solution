class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length%2!=0){
            return false;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int a[]=new int[max];
        for(int x:nums){
            a[x-1]++;
        }
        for(int x:nums){
            if(a[x-1]>0){
            if(a[x-1]%2!=0){
                return false;
            }
            else{
                a[x-1]=0;
            }
            }

        }
        return true;
    }
}