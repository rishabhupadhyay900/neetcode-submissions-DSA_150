class Solution {
    public boolean isValidSudoku(char[][] board) {

        
    
    // for row validation
     for(int i =0;i<9;i++){
        Set<Character> s = new HashSet<>();
        for(int j=0;j<9;j++){

            if (board[i][j] == '.') {
                    continue;
                }
            if(s.contains(board[i][j])){
             return false;

            }
            s.add(board[i][j]);
        }
     }
    // for column validation
     for(int i =0;i<9;i++){
        Set<Character> s = new HashSet<>();
        for(int j=0;j<9;j++){

            if (board[j][i] == '.') {
                    continue;
                }
                
            if(s.contains(board[j][i])){
             return false;

            }
             s.add(board[j][i]);
        }
     }
  
    // box validation

   for (int boxRow = 0; boxRow < 3; boxRow++) {

    for (int boxCol = 0; boxCol < 3; boxCol++) {

        Set<Character> s = new HashSet<>();

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                int row = boxRow * 3 + i;
                int col = boxCol * 3 + j;

                if (board[row][col] == '.') {
                    continue;
                }

                if (s.contains(board[row][col])) {
                    return false;
                }

                s.add(board[row][col]);
            }
        }
    }
}
    
    return true;
        
    }
}