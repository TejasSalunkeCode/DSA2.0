package _55_Binary_Tree_Ques.DFS;

public class Paths {
     public static class TreeNode {
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
    //Q
    public boolean hasPathSum(TreeNode root, int targetSum) {
    if(root==null){
        return false;
    }
    if(root.val==targetSum && root.left==null && root.right==null){
        return true;
    }
    return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
    }
    

    //129
     public int sumNumbers(TreeNode root) {
    return helper3(root,0);   
    }
    int helper3(TreeNode node,int sum){
        if(node==null){
            return 0;
        }
        sum=sum*10+node.val;

        if(node.left==null && node.right==null){
            return sum;
        }
        return helper3(node.left,sum)+helper3(node.right, sum);
    }

    //Q.124
    int ans=Integer.MIN_VALUE;
     public int maxPathSum(TreeNode root) {
        helper4(root);
        return ans;
    }
    int helper4(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=helper4(node.left);
        int right=helper4(node.right);

        left=Math.max(0, left);
        right=Math.max(0, right);

        int pathSum=left+right+node.val;
        ans=Math.max(ans, pathSum);

        return Math.max(left, right)+node.val;
    }


    //Q
    boolean findPath(TreeNode node , int[]arr){
        if(node==null){
            return arr.length==0;
        }
        return helper5(node,arr,0);
    }
    boolean helper5(TreeNode node,int[]arr,int index){
        if(node==null){
            return false;
        }
        if(index>=arr.length || node.val!=arr[index]){
            return false;
        }
        if(node.left == null && node.right==null &&  index==arr.length-1){
            return  true;
        }
        return helper5(node.left, arr, index+1) || helper5(node.right, arr, index+1);
    }
}
