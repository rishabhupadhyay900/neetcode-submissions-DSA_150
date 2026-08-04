class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n =nums.length;
        List<Integer> freq[] = new List[nums.length +1];

        for(int i=0;i<n;i++){
          mp.put(nums[i] , mp.getOrDefault(nums[i],0) + 1);
        }

        for(int i=0;i<=n;i++){
              freq[i] = new ArrayList<>();
        }
         
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
          freq[entry.getValue()].add(entry.getKey());
        }

        int res[] = new int[k];
        int index =0;

        for(int i = freq.length -1;i>0 && index < k;i--){
         for(int a : freq[i]){
          res[index++] = a;
          if(index == k){
            return res;
          }
         }

        }
           
     return res;
    }
}
