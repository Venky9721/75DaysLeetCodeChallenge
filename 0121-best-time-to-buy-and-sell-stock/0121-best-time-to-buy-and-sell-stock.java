class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        for(int p:prices){
            if(minPrice>p){
                minPrice = p;
            }
            profit = Math.max(profit,p-minPrice);

        }
        return profit;
    }
}