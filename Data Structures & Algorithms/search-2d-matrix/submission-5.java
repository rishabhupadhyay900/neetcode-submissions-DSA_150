class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length - 1;
        int m = matrix[0].length;

        // Step 1: Find correct row using binary search
        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;

            if (target >= matrix[mid][0] && target <= matrix[mid][m - 1]) {
                // Step 2: search inside row
                for (int j = 0; j < m; j++) {
                    if (matrix[mid][j] == target) return true;
                }
                return false;
            } 
            else if (target < matrix[mid][0]) {
                bottom = mid - 1;
            } 
            else {
                top = mid + 1;
            }
        }

        return false;
    }
}