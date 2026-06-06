class BuyOrSellStocks {
    public int maxProfit(int[] prices) {
        int profit = 0, maxProfit = 0, mini = prices[0];
        for(int i=1;i<prices.length;i++) {
            profit = prices[i]-mini;
            maxProfit = Math.max(maxProfit, profit);
            if(prices[i]<mini) {
                mini = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        BuyOrSellStocks obj = new BuyOrSellStocks();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(obj.maxProfit(prices));
    }
}