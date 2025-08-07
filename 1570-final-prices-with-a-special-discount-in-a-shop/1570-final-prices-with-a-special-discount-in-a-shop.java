class Solution {
    public int[] finalPrices(int[] prices) {
        int ans[]=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            int n=prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    n=n-prices[j];
                    break;
                }
            }
            ans[i]=n;
        }
        return ans;
    }
}