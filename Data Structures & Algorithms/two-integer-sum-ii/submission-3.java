class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int n = numbers.length;
      Map<Integer,Integer> mp = new HashMap<>();

       for(int i=0;i<n;i++){
        int x = (target - numbers[i]);
        
        if(mp.containsKey(x)){
            return new int[]{mp.get(x) , i+1};
        }

        mp.put(numbers[i] , i+1);

       }
      return new int[0];
      
    }
}
