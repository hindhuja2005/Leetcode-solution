class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            Set<Integer> s1=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                s1.add(nums[j]);
                if(s1.size()==s.size()){
                    count++;
                }
            }
        }
        return count;
    }
}