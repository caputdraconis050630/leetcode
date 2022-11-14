class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set set = new HashSet();
        for (int i=0; i<9; ++i) {
            for (int j=0; j<9; ++j) {
                if (board[i][j] != '.') {
                    String el = "[" + board[i][j] + "]";
                    if (!set.add(el + i) || !set.add(j + el) || !set.add(i/3 + el + j/3))
                        return false;
                }
            }
        }
        return true;
    }
}