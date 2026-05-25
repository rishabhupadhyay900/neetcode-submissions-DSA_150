class Solution {

    public boolean rec(int nums[],int n,int s){
        
         if(n ==0 && s !=0){
            return false;
        }
        
        if(s ==0){
            return true;
        }
       

        if(nums[n-1] <= s){
            return rec(nums,n-1,s-nums[n-1]) || rec(nums,n-1,s);
        }
        else{
            return rec(nums,n-1,s);
        }
    }
    public boolean canPartition(int[] nums) {

        int n = nums.length;
        int s = 0;
        for(int i : nums){
            s+= i;
        }

        if(s%2==0){
            return rec(nums,n,s/2);
        }
        else{
            return false;
        }
        
    }
}
