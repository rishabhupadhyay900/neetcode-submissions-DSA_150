class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int count =0,prod =1;

        for(int num : nums){
            if(num != 0){
                prod *= num;
            }
            else{
                count++;
            }
        }

        if(count > 1){
            return new int[n];
        }
        int res[] = new int[n];

        for(int i=0;i<n;i++){
            if(count ==1){
                res[i] = (nums[i]==0) ? prod : 0;
            }
            else{
                res[i] = prod / nums[i];
            }
        }
        return res;
    }
}  
