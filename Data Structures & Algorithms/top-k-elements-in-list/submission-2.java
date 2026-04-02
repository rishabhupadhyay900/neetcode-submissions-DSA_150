class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
          mp.put(nums[i] , mp.getOrDefault(nums[i],0)+1);
        }

        List<int[]> l = new ArrayList<>();
      
      for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
        
        l.add(new int[]{entry.getValue(),entry.getKey()});
      }
      l.sort((a,b) -> b[0] - a[0]);

      int res[] = new int[k];

      for(int i=0;i<k;i++){
        res[i] = l.get(i)[1];
      }
      return res;

    }
}
