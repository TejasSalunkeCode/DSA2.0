import BST.TreeNode;

public class leetcode_1022 {
    public static void main(String[] args) {

    }

    public static int sumRootToLeaf(TreeNode root) {
        return solve(root,0);
    }
    public int solve(leetcode_865.TreeNode root,int val){
        if(root==null){
            return 0;
        }

        val=(2*val)+root.val;

        if(root.left==null && root.right==null){
            return val;
        }
        return solve(root.left, val)+solve(root.right, val);
    }
}
