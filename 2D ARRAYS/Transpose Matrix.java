class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        int newRows=cols;
        int newCols=rows;
        int newMatrix[][]=new int [newRows][newCols];
        for(int i=0;i<rows;i++){
            for(int j=0; j<cols;j++){
                newMatrix[j][i]=matrix[i][j] ;
            }
        }
        
    return newMatrix;
    }
}
