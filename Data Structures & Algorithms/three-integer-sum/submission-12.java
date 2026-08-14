class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);
        
        List<List<Integer> > res = new ArrayList<>();

       for(int i =0;i<n;i++){
        if(i > 0 && nums[i] == nums[i-1]){
            continue;
        }
        int l = i+1;
        int r = n-1;
        

         while(l < r ){
            int sum = nums[i] + nums[l] + nums[r];

            if(sum == 0){
                List<Integer> sub = new ArrayList<>();
                sub.add(nums[i]);
                sub.add(nums[l]);
                sub.add(nums[r]);
                res.add(sub);
                l++;
                r--;
                while(l < r && nums[l] == nums[l-1]){
                    l++;
                }
                while(l < r && nums[r] == nums[r+1]){
                    r--;
                }

            }

            else if(sum > 0){
                r--;
            }
            else{
              l++;
            }

        }

       }
        return res;
    }
}
