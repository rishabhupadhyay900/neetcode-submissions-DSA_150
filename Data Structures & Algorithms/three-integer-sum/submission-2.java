class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> res = new LinkedHashSet<>();
        Arrays.sort(nums);
        
         for(int i=0;i<n;i++){
           //  if (i > 0 && nums[i] == nums[i-1]) continue;
             Set<Integer> mp = new HashSet<>();
             for(int j = i + 1; j < n; j++){
                int num = nums[j];
                int diff = -(nums[i] + num);
                if(mp.contains(diff)){
                     List<Integer> l = Arrays.asList(nums[i], diff, num);
                    res.add(l);
                   // mp.remove(l);
                }
                else
                mp.add(num);
             }
           
         }
         return new ArrayList<>(res);
    }
}