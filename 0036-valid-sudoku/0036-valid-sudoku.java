class Solution {
    public boolean isValidSudoku(char[][] board) {
        return (isValidRow(board) & isValidCol(board) & isValidSubBox(board));
    }
    private boolean isValidRow(char[][] board){
        for(int i=0;i<9;i++){
            ArrayList<Character> arr=new ArrayList<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.')
                    if(!arr.contains(board[i][j]))
                        arr.add(board[i][j]);
                    else
                        return false;
            }
        }
        return true;
    }
    private boolean isValidCol(char [][]board){
        for(int i=0;i<9;i++){
            ArrayList<Character> arr=new ArrayList<>();
            for(int j=0;j<9;j++){
                if(board[j][i]!='.')
                    if(!arr.contains(board[j][i]))
                        arr.add(board[j][i]);
                    else
                        return false;
            }
        }
        return true;
    }
    private boolean SubBox(char[][] board, int row, int col){
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=row;i<3+row;i++){
            for(int j=col;j<3+col;j++){
                if(board[i][j]!='.')
                    if(!arr.contains(board[i][j]))
                        arr.add(board[i][j]);
                    else
                        return false;
            }
        }
        return true;
    }
    private boolean isValidSubBox(char[][] board){
        boolean isvalid=true;
        for(int i=0;i<=6;i+=3){
            for(int j=0;j<=6;j+=3){
                isvalid=SubBox(board,i,j);
                if(!isvalid)
                    return isvalid;
            }
        }
        return true;
    }
}