class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int seen[] = new int[n];

        for(int i : nums){
            if(seen[i-1] == 1){
                return i;
            }
            seen[i-1] = 1;
        }
       return -1;
    }
}