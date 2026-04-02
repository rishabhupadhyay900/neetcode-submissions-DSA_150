class Solution {
    public int maxProfit(int[] prices) {
        int osum = 0;
        int sum = prices[0];
        int min = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i] > min){
              sum = prices[i] - min;
              osum = Math.max(osum,sum);
            }
            else{
             min = prices[i];
            }
        }
        return osum;
    }
}
