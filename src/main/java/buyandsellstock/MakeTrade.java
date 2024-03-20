package buyandsellstock;

public interface MakeTrade {

    /**
     *
     * Maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     *
     * If I buy on day i, then must sell on at least day i + 1
     *
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     * @param prices an array prices where prices[i] is the price of a given stock on the ith day.
     *
     * @return maximum profit to sell for.
     */
    int maxProfit(int[] prices);

}
