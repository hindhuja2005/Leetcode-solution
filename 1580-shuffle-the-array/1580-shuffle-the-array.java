class Solution {
    public int[] shuffle(int[] nums, int n) {
        int k=n;
        for (int i=1;i<2*n;i+=2){
            int t=nums[k];
            for(int j=k;j>i;j--){
                nums[j]=nums[j-1];
            }
            nums[i]=t;
            k++;
        }
        return nums;
    }
}