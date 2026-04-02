class Solution {
    public int longestConsecutive(int[] nums) {
         
        Arrays.sort(nums);
        int n = nums.length;
        if(n==0){
            return 0;
        }
       
        int lastsmall = Integer.MIN_VALUE;
        int count = 1;
        int res = 0;
        for(int i=0;i<n;i++){
             
            if(nums[i] - lastsmall == 1){
                count++;
                lastsmall = nums[i];
            }
            else if(nums[i] - lastsmall != 1 && nums[i] != lastsmall ){
              count = 1;
              lastsmall = nums[i];
            }
           
            
             res = Math.max(count, res);
        }
    return res;
    }
}
