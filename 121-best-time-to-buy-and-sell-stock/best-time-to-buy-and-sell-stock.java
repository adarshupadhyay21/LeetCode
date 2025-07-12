class Solution {
    public int maxProfit(int[] prices) {
       int maxpro=0;
       int minprice=prices[0];
       for(int i=0;i<prices.length;i++){
        minprice = Math.min(minprice,prices[i]);
        maxpro = Math.max(maxpro,prices[i]-minprice);
        }
        return maxpro;
    }
}