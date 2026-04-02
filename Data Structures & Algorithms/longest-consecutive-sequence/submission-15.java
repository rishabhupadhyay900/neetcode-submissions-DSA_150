class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length-1;
        if(n==-1){
            return 0;
        }
        
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int max=0;

        for(int i=0;i<n;i++){
           
          if(nums[i] == nums[i+1]){
            continue;
          }
          else if(nums[i+1] - nums[i] == 1 ){
                res.add(nums[i]);
                max = Math.max(max , res.size());

            }
            else{
                res.clear();
            }
        }
       return max+1 ; 
    }
}
