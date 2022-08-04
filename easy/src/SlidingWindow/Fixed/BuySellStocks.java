package src.SlidingWindow.Fixed;

public class BuySellStocks {
    public int naiveSolution(int[] prices){
        /*
            Naive soluion:
            Iterate over the profits, having one pointer looking at buy, and another at sell.
                 - conditions for sell:
                    can't be same day as buy day
                    can only be after we buy stock;
            Inefficient as it's running in O(n log n) time complexity because we're iterating through our
            through every single possible buy day (buyIndex) = O(n), and for every valid sell day O(k).
            So, we have a time complexity of O(n) * O(k) = O(n*k)
        */
        int maxProfit = 0;
        for(int buyIndex = 0; buyIndex < prices.length; buyIndex++){
            for (int sellIndex = buyIndex + 1; sellIndex < prices.length; sellIndex++){
                int currProfit = prices[sellIndex] - prices[buyIndex];
                //System.out.printf("Profit from buying at day %d and selling at day %d: $%d: MaxProfit\n", buyIndex, sellIndex, currProfit);
                if(currProfit > maxProfit){
                    maxProfit = currProfit;

                }
            }
        }
        //System.out.println("Max profit: " + maxProfit);
        return maxProfit;
    }

    public int solution(int [] prices){
        int maxProfit = prices[1] - prices[0];
        int sellIndex = 1;
        for(int i = 1; sellIndex < prices.length-1; i++){

            int currProfit = prices[++sellIndex] - prices[i];
            System.out.println(currProfit);
        }
        return maxProfit;
    }
    public int maxProfit(int[] prices) {
        //First, we want to find a day where we buy stock :)
        //Initial thoughts:
        /*
            Day = index
            prices[index] = value

            Find the day with the lowest price with the highest max on the right side of the day.
                -use min & max function for that
            this will be our buy day.

            Next, we only look @ the days after we buy the stock.
        */
        return solution(prices);
        //return naiveSolution(prices);
    }
}
