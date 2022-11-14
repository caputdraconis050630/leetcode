class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowNum = matrix.length;
        int targetRow = 0;
        for (int i=0; i<rowNum; i++) {
            if (matrix[i][0] > target)
                return false;
            if ( i == rowNum-1) {
                targetRow = i;
                break;
            }
            if (matrix[i][0] <= target && matrix[i+1][0] > target) {
                targetRow = i;
                break;
            }
        }
        return checkRow(matrix, targetRow, target);
    }
    
    public boolean checkRow(int[][] matrix, int r, int target) {
        int len = matrix[r].length;
        for (int i=0; i<len; i++) {
            if (matrix[r][i] == target)
                return true;
        }
        return false;
    }
}