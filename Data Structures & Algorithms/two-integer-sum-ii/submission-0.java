class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int x = target - numbers[i];

            if(mp.containsKey(x)){
                return new int[]{mp.get(x)+1,i+1};
            }
            mp.put(numbers[i] , i);
        }
       return new int[0];
    }
}
