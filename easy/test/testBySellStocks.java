package test;
import src.SlidingWindow.Fixed.BuySellStocks;
public class testBySellStocks {
    public static void testCases(BuySellStocks obj){
        assert obj.maxProfit(new int[]{7,6,4,3,1}) == 0;
        //assert obj.maxProfit(new int[]{7,1,5,3,6,4})== 5;
        //assert obj.maxProfit(new int[]{}) == 0;
    }
    public static void main(String args[]){
        BuySellStocks sellStocks = new BuySellStocks();
        int[] profits = new int[]{7,1,5,3,6,4};
        sellStocks.maxProfit(profits);
        testCases(sellStocks);
    }
}


