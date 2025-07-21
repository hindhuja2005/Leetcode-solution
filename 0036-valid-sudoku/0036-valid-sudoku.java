class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            int row[]=new int[9];
            int col[]=new int[9];
            int cube[]=new int[9];
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(row[board[i][j]-'1']!=0){
                        return false;
                    }
                    else{
                        row[board[i][j]-'1']++;
                    }
                }
                
                if(board[j][i]!='.'){
                    if( col[board[j][i]-'1']!=0){
                        return false;
                    }
                    else{
                        col[board[j][i]-'1']++;
                    }
                }
                
                int ri=3*(i/3);
                int ci=3*(i%3);
                if(board[ri+j/3][ci+j%3]!='.'){
                    if(cube[board[ri+j/3][ci+j%3]-'1']!=0){
                        return false;
                    }
                    else{
                        cube[board[ri+j/3][ci+j%3]-'1']++;
                    }
                }
            }
        }
        return true;
    }
}