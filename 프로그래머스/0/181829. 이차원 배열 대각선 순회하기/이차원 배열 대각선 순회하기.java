class Solution {
    public int solution(int[][] board, int k) {
        int row = board.length;
        int col = board[0].length;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i + j <= k) {
                    sum += board[i][j];
                }
            }
        }
        return sum;
    }
}