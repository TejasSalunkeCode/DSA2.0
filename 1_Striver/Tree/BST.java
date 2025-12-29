public class BST {
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

    // ceil in BST

    public static int findCeil(TreeNode root, int key) {
        int ceil = -1;
        while (root != null) {
            if (root.val == key) {
                ceil = root.val;
                return ceil;
            }
            if (key > root.val) {
                root = root.right;
            } else {
                ceil = root.val;
                root = root.left;
            }
        }
        return ceil;
    }
    

    // Floor in BST
    public static int floorInBST(TreeNode root, int key) {
        int floor = -1;
        while (root != null) {
            if (root.val == key) {
                floor = root.val;
                return floor;
            }
            if (key > root.val) {
                floor = root.val;
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return floor;
    }

    // insert a node into BST
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        TreeNode cur = root;
        while (true) {
            if (cur.val <= val) {
                // right
                if(cur.right !=null){
                    cur=cur.right;
                }
                else{
                    cur.right=new TreeNode(val);
                    break;
                }

            } else {
                // left
                if(cur.left !=null){
                    cur=cur.left;
                }else{
                    cur.left=new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }


    //delete a node
     public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.val==key){
            return helper(root);
        }
        TreeNode dummy = root;
        while (root!=null) {
            if(root.val>key){
                if(root.left !=null && root.left.val==key){
                    root.left=helper(root.left);
                    break;
                }else{
                    root=root.left;
                }
            }else{
                if(root.right !=null && root.right.val==key){
                    root.right=helper(root.right);
                    break;
                }else{
                    root=root.right;
                }
            }
        }
        return dummy;
    }
    
    public TreeNode helper(TreeNode root){
        if(root.left==null){
            return root.right;
        }
        else if (root.right == null) {
            return root.left;
        }else{
            TreeNode rightChild = root.right;
            TreeNode lastRight = findLastRight(root.left);
            lastRight.right=rightChild;
            return root.left;
        }
    }
    public TreeNode findLastRight(TreeNode root){
        if(root.right==null){
            return root;
        }
        return findLastRight(root.right);
    }
}
