class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
       // int j=0;
        int ii = matrix.length-1;
        int jj = matrix[0].length;

        while(i <= ii ){
            int mid = i+(ii-1)/2;
         
            
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[mid][j] == target){
                    return true;
                }
                else if(matrix[mid][j] > target){
                    ii = mid -1;
                   
                }
                else{
                    i = mid +1;
                   
                }
            }
          

        }

        return false;
    }
}
