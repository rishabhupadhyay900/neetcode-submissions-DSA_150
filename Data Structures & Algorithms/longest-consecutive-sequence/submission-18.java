class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> s = new HashSet<>();
        int n = nums.length;
        int ans =0;

        for(int i=0;i<n;i++){
            s.add(nums[i]);
        }

        for(int num : nums){

        if(!s.contains(num -1)){
            int length =1;
            while(s.contains(num + length)){
                length++;

            }
            ans = Math.max(ans,length);
        }

        }
        return ans;
    }
}
