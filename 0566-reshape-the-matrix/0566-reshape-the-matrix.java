class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        final int mr = mat.length; // 기존 2차원 배열의 r
        final int mc =  mat[0].length; // 기존 2차원 배열의 c
        final int n =  mr * mc; // 기존 2차원 배열 항의 개수

        // 예외처리
        if (r * c != n) {
            return mat;
        }

         final int[][] ret = new int[r][c]; // 리턴할 2차원 배열 선언. 배열에 들어가있는 값만 변경될 뿐, 배열의 첫 주소값은 변하지 않기에 final로 선언 가능
         int k = 0; // 채운 숫자의 개수
         for (int i = 0; i < mr; i++) {
             for (int j = 0; j < mc; j++) {
                 ret[k / c][k % c] = mat[i][j];
                 k++;
             }
         }
         return ret; // 리턴
    }
}
