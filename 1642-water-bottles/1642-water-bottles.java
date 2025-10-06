class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        while(numBottles>=numExchange){
            int i=numBottles/numExchange;
            int j=numBottles%numExchange;
            numBottles=i+j;
            ans+=i;
        }
        return ans;
    }
}