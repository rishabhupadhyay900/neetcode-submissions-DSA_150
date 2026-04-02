class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int res=0;

    for(int num : nums){
            s.add(num);
    }
       for(int num : nums){
        int count=0,curr = num;
        if(!s.contains(curr -1)){
            while(s.contains(curr)){
            count++;
            curr++;
        }
        res =  Math.max(res, count);

        }
       }
      return res;
    }
}
