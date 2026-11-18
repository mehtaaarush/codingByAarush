class Solution {
    public int[][] transpose(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new int[0][0];
        }

        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[m][n];

        for(int row = 0 ; row < n ; row++){
            for(int col = 0 ; col < m ; col++){
                result[col][row] = matrix[row][col];
            }
        }
        return result;
    }
}