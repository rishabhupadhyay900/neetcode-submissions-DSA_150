class Solution {

    public boolean rec(int nums[],int n,int s,Boolean dp[][]){
        
         if(n ==0 && s !=0){
            return false;
        }
        
        if(s ==0){
            return true;
        }
        if(dp[n][s] != null){
           return dp[n][s];
        }

      for(int i =1;i<=n;i++){
        for(int j=1;j<=s;j++){
             if(nums[i-1] <= j){
             dp[i][j] = dp[i-1][j- nums[i-1]] || dp[i-1][j];
             }
             else{
             dp[i][j] = dp[i-1][j];
           }
        }
      }
           return dp[n][s];
    }
    public boolean canPartition(int[] nums) {

        int n = nums.length;
        int s = 0;
        for(int i : nums){
            s+= i;
        }
        Boolean dp[][] = new Boolean[n+1][s/2 +1];
        
        for(int i = 0;i<=n;i++){
            dp[i][0] = true;
        }
        for(int i =1;i<=s/2;i++){
            dp[0][i] = false;
        }

        if(s%2==0){
            return rec(nums,n,s/2,dp);
        }
        else{
            return false;
        }
        
    }
}
