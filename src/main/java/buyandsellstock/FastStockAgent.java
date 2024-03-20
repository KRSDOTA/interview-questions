package buyandsellstock;

public class FastStockAgent implements MakeTrade {

    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i] < buy){
                buy = prices[i];
            } else if(prices[i] - buy > profit){
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}
