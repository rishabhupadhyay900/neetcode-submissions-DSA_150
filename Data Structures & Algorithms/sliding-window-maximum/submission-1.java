class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        List<Integer> l = new ArrayList<>();
        int n = nums.length;
        

        for(int i=0;i<n-k+1;i++) {
            int maxs = Integer.MIN_VALUE;
            for(int j=0;j<k;j++){
               maxs = Math.max(maxs,nums[i+j]);

            }
            l.add(maxs);
        }

        int arr[] = new int[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i] = l.get(i);
        }
        return arr;
    }
}
