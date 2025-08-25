class Solution {
    List<List<Integer>> subset=new ArrayList<>();
    public int subsetXORSum(int[] nums) {
        subset(nums,0,new ArrayList<>());
        int res=0;
        for(List<Integer> a:subset){
            int x=0;
            for(int i:a){
                x^=i;
            }
            res+=x;
        }
        return res;
    }
    public void subset(int[] nums,int i,List<Integer> s){
        if(i==nums.length){
            subset.add(new ArrayList<>(s));
            return;
        }
        subset(nums,i+1,s);
        s.add(nums[i]);
        subset(nums,i+1,s);
    }
}