class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         
         int n = matrix.length;
         int m = matrix[0].length;
       
       int l =0,r = n-1;
       int row =-1;
       while(l <= r){
        int mid = l + (r-l)/2;
        if(matrix[mid][m-1] >= target){
              row = mid;
              r = mid-1;
        }
        else{
            l = mid+1;
        }
       }
       int i =0,j = m-1;
       if(row == -1){
        return false;   
       }
       while(i <= j){
        int mi =  i + (j-i)/2;

        if(matrix[row][mi] == target){
            return true;
        }
        else if(matrix[row][mi] > target){
            j = mi -1;
        }
        else{
            i = mi +1;
        }
       }
       return false;
    }
}