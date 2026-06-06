class BuyOrSellStockII {
    public int maxProfit(int[] prices) {
        int profit = 0, mini = prices[0];
        for(int i=1;i<prices.length;i++) {
            if(prices[i]-mini>0) {
                profit += prices[i]-mini;
            }
            mini = prices[i];
        }
        return profit;
    }
    public static void main(String[] args) {
        BuyOrSellStockII obj = new BuyOrSellStockII();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(obj.maxProfit(prices));
    }
}