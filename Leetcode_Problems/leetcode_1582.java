public class leetcode_1582 {
    public static void main(String[] args) {
        int[][] mat = {
                { 1 },
                { 0 }
        };
        System.out.println(numSpecial(mat));
    }

    public static int numSpecial(int[][] mat) {
        boolean flag = true;

        int i = 0, j = 0;
        int cnt = 0, cnt2 = 0;

        while (flag) {
            if (mat[i][j] == 1) {
                for (int k = 0; k < mat[0].length; k++) {
                    if (mat[i][k] == 1) {
                        cnt2++;
                    }
                }
                for (int k = 0; k < mat.length; k++) {
                    if (mat[k][j] == 1) {
                        cnt2++;
                    }
                }
                if (cnt2 == 2) {
                    cnt = cnt + 1;
                }
                cnt2 = 0;
            }
            if (j == mat[0].length - 1 && i != mat.length - 1) {
                i++;
                j = 0;
            } else {
                j++;
            }
            if (i == mat.length - 1 && j == mat[0].length) {
                flag = false;
            }
        }

        return cnt;
    }
}