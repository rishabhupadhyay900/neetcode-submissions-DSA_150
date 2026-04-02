class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>() ;

        if(nums.length ==0){
            return 0;
        }
        
        int res =1;
  // adding all array elemmts to set
        for(int num : nums){
            s.add(num);
        }
        for(int num : nums){
            if(!s.contains(num-1)){
                int count =1;
                while(s.contains(num + count)){
                    count++;
                } 
                res = Math.max(res,count);
            }
        }
 return res;
     
    }
}
