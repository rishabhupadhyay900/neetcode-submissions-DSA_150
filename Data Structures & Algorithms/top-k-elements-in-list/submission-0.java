class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer , Integer> mp = new HashMap<>();
    // Insert Nums array into map
        for(int i : nums){
          mp.put(i , mp.getOrDefault(i,0)+1);
        }
        
    // insert map key and value into List of int[] in reverse order
    List<int []> arr = new ArrayList<>();
    for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
      arr.add(new int[]{entry.getValue() , entry.getKey()});
    }
    arr.sort((a,b) -> b[0] - a[0]);  // sorting in decending order
    
    int res[] = new int[k];
    for(int i =0;i<k;i++){
      res[i] = arr.get(i)[1];
    }
        return res;
    }
}
