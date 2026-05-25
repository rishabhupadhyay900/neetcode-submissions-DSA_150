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

        if(nums[n-1] <= s){
            return dp[n][s] = rec(nums,n-1,s-nums[n-1],dp) || rec(nums,n-1,s,dp);
        }
        else{
            return dp[n][s] = rec(nums,n-1,s,dp);
        }
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
