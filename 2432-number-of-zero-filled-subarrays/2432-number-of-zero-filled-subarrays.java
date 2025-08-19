class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            else{
                for(int j=1;j<=zero;j++){
                    count+=j;
                }
                zero=0;
                
            }
        }
        for(int j=1;j<=zero;j++){
            count+=j;
        }
        return count;
    }
}