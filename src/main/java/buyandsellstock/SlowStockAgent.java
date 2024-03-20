package buyandsellstock;

public class SlowStockAgent implements MakeTrade {
    @Override
    public int maxProfit(int[] prices) {
        int currentMaxProfit = 0;

        for (int i = 0; i < prices.length; i++) { // buying loop
            for (int j = i + 1; j < prices.length; j++) { // selling loop
                int profit = prices[j] - prices[i];
                if(currentMaxProfit < profit){
                    currentMaxProfit = profit;
                }
            }
        }
        return currentMaxProfit;
    }
}
