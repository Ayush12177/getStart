class Solution {
    public int maxProfit(int[] prices) {
        int buyStock=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0; i<prices.length; i++){
            if(buyStock < prices[i]){
                int currProfit=prices[i] - buyStock;
                maxProfit=Math.max(maxProfit, currProfit);
            } else {
                buyStock= prices[i];

            }
        }
        return maxProfit;
        
    }
}