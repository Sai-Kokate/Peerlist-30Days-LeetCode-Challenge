import java.util.*;

public class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        //  at start the buying price will always be first day's price
        int buyPrice = prices[0];

        // considering default answer
        int ans = 0;

        //  iterate over the prices
        for(int i=1; i<prices.length; i++){
            // check the differnce
            int diff = prices[i] - buyPrice;

            // max of diff and ans would be final ans 
            ans = Math.max(diff, ans);

            // if current price is less than buy price , update buy price
            if(buyPrice > prices[i]){
                buyPrice = prices[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        int ans = maxProfit(arr);
        System.out.println("Max profit is: " + ans);
    }
}