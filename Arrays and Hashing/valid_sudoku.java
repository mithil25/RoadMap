class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = board.length;
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] grid = new int[9][9];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] != '.') {
                    int num = (board[i][j] - '0') - 1;
                    int k = (i / 3) * 3 + j / 3;
                    if (row[i][num] == 1 || col[j][num] == 1 || grid[k][num] == 1) {
                        return false;
                    }
                    row[i][num] = col[j][num] = grid[k][num] = 1;

                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        Solution s1 = new Solution();
        System.out.print(s1.isValidSudoku(board) ? "YES....\n" : "NO...\n");
    }
}