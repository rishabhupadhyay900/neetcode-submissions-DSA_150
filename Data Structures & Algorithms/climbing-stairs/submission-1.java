class Solution {

    public int rec(int n,int dp[]){

        //Base case
        if(n < 0){
            return 0;
        }
        if(n ==1 || n ==0){
            return 1;
        }
      
        if(dp[n] != 0){
            return dp[n];
        }
        int left = rec(n-1,dp);
        int right = rec(n-2,dp);

        return dp[n] = left+ right;
    }
    public int climbStairs(int n) {

        int dp[] = new int[n+1];
       return rec(n,dp);

    }
}
