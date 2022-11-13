class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        final int mr = mat.length;
        final int mc =  mat[0].length;
        final int n =  mr * mc;

        // check arguments
        if (r * c != n) {
            return mat;
        }

         // create reshaped matrix
         final int[][] ret = new int[r][c];
         int k = 0; // number of cells filled in so far
         for (int i = 0; i < mr; i++) {
             for (int j = 0; j < mc; j++) {
                 ret[k / c][k % c] = mat[i][j]; // see explanation above
                 k++;
             }
         }
         return ret;
    }
}