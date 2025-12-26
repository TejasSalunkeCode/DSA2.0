import java.util.ArrayList;

public class leetcode_110 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isBalanced(TreeNode root) {
        return defHeight(root)!=-1;
    }
    int defHeight(TreeNode root){
        if(root == null) return 0;

        int leftHeight = defHeight(root.left);
        if(leftHeight==-1) return -1;
        int rightHeight = defHeight(root.right);
        if (rightHeight==-1) {
            return -1;
        }
        if(Math.abs(leftHeight-rightHeight)>1) {
            return -1;}
        return Math.max(leftHeight, rightHeight)+1;
    }

    //symmetric Tree
    public boolean isSymmetric(TreeNode root){
        return root==null || isSymmetricHelp(root.left,root.right);
    }
    private boolean isSymmetricHelp(TreeNode left,TreeNode right){
        if(left==null || right==null){
            return left==right;
        }
        if(left.val!=right.val) return false;

        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }


    //root to node path
    private boolean getPath(TreeNode root,ArrayList<Integer> arr,int x){
        if(root==null){
            return false;
        }
        arr.add(root.val);
        if(root.val==x){
            return true;
        }
        if(getPath(root.left,  arr, x) || getPath(root.right, arr, x)){
            return true;
        }
        arr.remove(arr.size()-1);
        return false;
    }

    public ArrayList<Integer> solve(TreeNode A,int B){
        ArrayList<Integer> arr = new ArrayList<>();
        if(A==null) return arr;
        getPath(A, arr, B);
        return arr;
    }


    //Lowest Common Ancestor
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        //base case
        if(root==null || root==p || root==q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        //results
        if(left==null){
            return right;
        }else if(right==null){
            return left;
        }else{
            return root;
        }
    }

}
