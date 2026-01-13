package Graph;

public class Replace0swthX {

    static void dfs(int row, int col, int vis[][], char mat[][], int delrow[], int delcol[]) {
        int n = mat.length;
        int m = mat[0].length;

        vis[row][col] = 1;   // mark visited

        for (int i = 0; i < 4; i++) {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];

            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
                    vis[nrow][ncol] == 0 && mat[nrow][ncol] == '0') {

                dfs(nrow, ncol, vis, mat, delrow, delcol);
            }
        }
    }

    static char[][] fill(int n, int m, char mat[][]) {
        int delrow[] = {-1, 0, 1, 0};
        int delcol[] = {0, 1, 0, -1};

        int vis[][] = new int[n][m];

        // Traverse first and last row
        for (int j = 0; j < m; j++) {
            if (vis[0][j] == 0 && mat[0][j] == '0') {
                dfs(0, j, vis, mat, delrow, delcol);
            }
            if (vis[n - 1][j] == 0 && mat[n - 1][j] == '0') {
                dfs(n - 1, j, vis, mat, delrow, delcol);
            }
        }

        // Traverse first and last column
        for (int i = 0; i < n; i++) {
            if (vis[i][0] == 0 && mat[i][0] == '0') {
                dfs(i, 0, vis, mat, delrow, delcol);
            }
            if (vis[i][m - 1] == 0 && mat[i][m - 1] == '0') {
                dfs(i, m - 1, vis, mat, delrow, delcol);
            }
        }

        // Replace unvisited '0' with 'X'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j] == 0 && mat[i][j] == '0') {
                    mat[i][j] = 'X';
                }
            }
        }

        return mat;
    }
}
