package _55_Binary_Tree_Ques.DFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import _47_stack_Queue_Q.reqPar;

public class dfss {
    int diameter = 0;

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

    public int diamerterOfBinaryTree(TreeNode root) {

        height(root);
        return diameter - 1;
    }

    int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int RightHeight = height(node.right);

        int dia = leftHeight + RightHeight + 1;
        diameter = Math.max(diameter, dia);

        return Math.max(leftHeight, RightHeight) + 1;
    }

    // Q.226
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    // Q.104
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        int ans = Math.max(left, right) + 1;

        return ans;

    }

    public void flatten(TreeNode root) {
        TreeNode current = root;
        while (current != null) {
            if (current.left != null) {
                TreeNode temp = current.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }

    // Q.98
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public boolean helper(TreeNode node, Integer low, Integer high) {
        if (node == null) {
            return true;
        }
        if (low != null && node.val <= low) {
            return false;
        }
        if (high != null && node.val >= high) {
            return false;
        }
        boolean left = helper(node.left, low, node.val);
        boolean right = helper(node.right, node.val, high);

        return left && right;
    }

    // Q.236
    public TreeNode lowestCommonAncesstor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncesstor(root.left, p, q);
        TreeNode right = lowestCommonAncesstor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left == null ? right : left;
    }

    // 230
    int count = 0;

    public int KthSamllest(TreeNode root, int k) {
        return helper2(root, k).val;
    }

    public TreeNode helper2(TreeNode root, int k) {
        if (root == null) {
            return null;
        }
        TreeNode left = helper2(root.left, k);
        if (left != null) {
            return left;
        }
        count++;
        if (count == k) {
            return root;
        }
        return helper2(root.right, k);
    }

}

    // 112
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