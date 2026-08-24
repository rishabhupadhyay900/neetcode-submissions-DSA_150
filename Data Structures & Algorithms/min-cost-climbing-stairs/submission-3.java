class Solution {
    public int rec(int cost[],int n,int dp[]){
      
      if(n < 0){
        return 0;
      }
       if(n ==0 || n == 1){
        return 0;
       }
       
       if(dp[n] != 0){
        return dp[n];
       }
        int left = cost[n-1] + rec(cost,n-1,dp);
        int right = cost[n-2] + rec(cost,n-2,dp);

        return dp[n] =  Math.min(left , right);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n+1];
        return rec(cost,n,dp);
    }
}
