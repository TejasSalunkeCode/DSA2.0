import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
        if (root == null)
            return 0;

        int left = getHeightLeft(root);
        int right = getHeightRight(root);

        if (left == right)
            return ((2 << (left)) - 1);

        else
            return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public int getHeightLeft(TreeNode root) {
        int count = 0;
        while (root.left != null) {
            count++;
            root = root.left;
        }
        return count;
    }

    public int getHeightRight(TreeNode root) {
        int count = 0;
        while (root.right != null) {
            count++;
            root = root.right;
        }
        return count;
    }

    // Construct the Binary Tree from Postorder and Inorder Traversal

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null || inorder.length!= postorder.length){
            return null;
        }

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for (int i = 0; i < inorder.length; ++i) {
            hm.put(inorder[i], i);
        }

        return buildTreePostIn(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, hm);
        
    }

    private TreeNode buildTreePostIn(int[] inorder,int is,int ie,int[] postorder,int ps,int pe, HashMap<Integer,Integer> hm){
        if(ps>pe || is>ie){
            return null;
        }

        TreeNode root = new TreeNode(postorder[pe]);

        int inRoot = hm.get(postorder[pe]);
        int numLeft = inRoot-is;
        root.left=buildTreePostIn(inorder, is, inRoot-1, postorder, ps, ps+numLeft-1, hm);

        root.right=buildTreePostIn(inorder, inRoot+1, ie, postorder, ps+numLeft, pe-1, hm);
        return root;
    }


    //leetcode 144 //morris soloution (without stack or recursion)
    public List<Integer> preOrderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        TreeNode cur = root;

        while (cur!=null) {
            if(cur.left==null){
                res.add(cur.val);
                cur=cur.right;
            }else{
                TreeNode prev = cur.left;
                while (prev.right != null && prev.right !=cur) {
                    prev=prev.right;
                }
                if(prev.right==null){
                    res.add(cur.val);
                    prev.right=cur;
                    cur=cur.left;
                }else{
                    prev.right=null;
                    cur=cur.right;
                }
            }
        }
        return res;
    }

}
