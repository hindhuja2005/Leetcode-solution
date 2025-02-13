class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue <Long> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add((long)nums[i]);
        }
        int c=0;
        while(pq.peek()<k){
            long min1=pq.poll();
            if(!pq.isEmpty()){
            long min2=pq.poll();
            long a=(min1*2)+min2;
            pq.add(a);
            c++;
            }
            else{
                break;
            }
        }
        return c;
    }
}