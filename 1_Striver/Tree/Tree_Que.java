public class Tree_Que {
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

    // children sum prperty in binary tree
    public static void changeTree(TreeNode root) {
        if (root == null) {
            return;
        }
        int child = 0;
        if (root.left != null) {
            child += root.left.val;
        }

        if (root.right != null) {
            child += root.right.val;
        }

        if (child >= root.val) {
            root.val = child;
        } else {
            if (root.left != null) {
                root.left.val = root.val;
            } else if (root.right != null) {
                root.right.val = root.val;
            }
            changeTree(root.left);
            changeTree(root.right);
        }
        int tot = 0;
        if (root.left != null) {
            tot += root.left.val;
        }
        if (root.right != null) {
            tot += root.right.val;
        }
        if (root.left != null || root.right != null) {
            root.val = tot;
        }
    }

    // count total nodes in complete bbinary tree
    public int countNodes(TreeNode root) {
        if(root==null) return 0;

        int left=getHeightLeft(root);
        int right=getHeightRight(root);

        if(left==right) return ((2<<(left))-1);

        else return countNodes(root.left)+countNodes(root.right)+1;
    }

    public int getHeightLeft(TreeNode root){
        int count=0;
        while (root.left!=null) {
            count++;
            root=root.left;
        }
        return count;
    }

    
    public int getHeightRight(TreeNode root){
        int count=0;
        while (root.right!=null) {
            count++;
            root=root.right;
        }
        return count;
    }

}
