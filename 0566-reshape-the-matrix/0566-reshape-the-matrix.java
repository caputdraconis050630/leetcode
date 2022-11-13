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
        for (int i = 0; i < n; i++) {
            ret[i / c][i % c] = mat[i / mc][i % mc]; // see explanation above
        }
        return ret;
    }
}