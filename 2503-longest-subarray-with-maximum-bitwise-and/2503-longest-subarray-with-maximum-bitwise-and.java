class Solution {
    public int longestSubarray(int[] nums) {
        int maxlength=0;
        int maxand=0;
        for(int i:nums){
            if(i>maxand){
                maxand=i;
            }
        }
        /*for(int i=0;i<nums.length;i++){
            int tempand=nums[i];
            for(int j=i+1;j<nums.length;j++){
                tempand=tempand & nums[j];
                if(tempand==0){
                    break;
                }
                else if(tempand==maxand){
                    maxlength=Math.max(maxlength,j-i+1);
                }
            }
        }*/
        int currentlen=0;
        for(int i:nums){
            if(i==maxand){
                currentlen++;
            }
            else{
                maxlength=Math.max(maxlength,currentlen);
                currentlen=0;
            }
        }
        return Math.max(maxlength,currentlen);
    }
}