public class BuyAndSell2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("maximum profit: "+ buyAndSell(arr));
    
    }
    //Time Complexity : O(n) , Space Complexity : O(1)
    public static int buyAndSell(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int totalProfit = 0;
        for(int i=0; i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i]-buyPrice;
                totalProfit += profit;
            }
                buyPrice= prices[i];    
        }
        return totalProfit;
    }
}
