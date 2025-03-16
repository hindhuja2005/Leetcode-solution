class Solution {
    public int maxSum(int[] nums) {
        int m=Integer.MIN_VALUE;
        int sum=0;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            m=Math.max(m,nums[i]);
            if(nums[i]<=0||s.contains(nums[i])){
                continue;
            }
            sum+=nums[i];
            s.add(nums[i]);
        }
        return (sum>0)?sum:m;
    }
}