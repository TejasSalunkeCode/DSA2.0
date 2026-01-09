import java.util.*;

public class leetcode_865 {

    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Solution class
    static class Solution {

        class Pair {
            TreeNode node;
            int dist;

            Pair(TreeNode node, int dist) {
                this.node = node;
                this.dist = dist;
            }
        }

        public TreeNode subtreeWithAllDeepest(TreeNode root) {
            return solve(root, 0).node;
        }

        private Pair solve(TreeNode root, int depth) {
            if (root == null) return new Pair(null, depth);

            Pair left = solve(root.left, depth + 1);
            Pair right = solve(root.right, depth + 1);

            if (left.dist == right.dist) {
                return new Pair(root, left.dist);
            }
            return left.dist > right.dist ? left : right;
        }
    }

    // Main method for testing
    public static void main(String[] args) {

        /*
            Example Tree:
                    3
                   / \
                  5   1
                 / \ / \
                6  2 0  8
                  / \
                 7   4
        */

        TreeNode root = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(2, new TreeNode(7), new TreeNode(4))
                ),
                new TreeNode(1,
                        new TreeNode(0),
                        new TreeNode(8)
                )
        );

        Solution sol = new Solution();
        TreeNode ans = sol.subtreeWithAllDeepest(root);

        System.out.println("Subtree root containing all deepest nodes: " + ans.val);
    }
}
