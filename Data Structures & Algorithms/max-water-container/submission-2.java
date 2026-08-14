class Solution {
    public int maxArea(int[] heights) {

        int n = heights.length;
        int l =0,r =n-1;
        int sum = Integer.MIN_VALUE;
        while(l < r){
            int s = 0;

          if(heights[l] < heights[r]){
             s = heights[l]*(r-l);
             sum = Math.max(sum,s);
             l++;
          }
          else{
              s = heights[r]*(r-l);
             sum = Math.max(sum,s);
             r--;
          }


        }

        return sum;
        
    }
}
