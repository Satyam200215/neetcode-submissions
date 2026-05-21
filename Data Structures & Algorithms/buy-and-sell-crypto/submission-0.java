class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int size=prices.length;
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                profit=Math.max(profit,prices[j]-prices[i]);
            }
        }
        return profit;
    }
}
