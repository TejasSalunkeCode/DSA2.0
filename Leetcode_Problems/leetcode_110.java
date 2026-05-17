public class leetcode_110 {
    public static void main(String[] args) {
        
    }
    private static int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = dfs(root.left);
        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = dfs(root.right);
        if (rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static boolean isBalanced(TreeNode root) {
        return dfs(root) != -1;
    }
}
