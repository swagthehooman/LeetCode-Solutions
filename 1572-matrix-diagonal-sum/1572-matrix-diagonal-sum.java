class Solution {
    public int diagonalSum(int[][] mat) {
        if(mat.length==1)
            return mat[0][0];
        int sumDiagonal=0,n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                    sumDiagonal+=mat[i][j];
                else if(j==n-i-1)
                    sumDiagonal+=mat[i][j];
            }
        }
        return sumDiagonal;
    }
}