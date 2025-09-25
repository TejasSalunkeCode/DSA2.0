package Tree_Advance;

import java.util.HashMap;
import java.util.TreeMap;

import _55_Binary_Tree_Ques.DFS.Paths.TreeNode;

public class leetcode_105 {



     public TreeNode buildTree(int[] preorder, int[] inorder) {
    return helper(preOrder,inOrder,0,preorder.length-1,map,index);    
    }

    public TreeNode helper(int[]preOrder,int[]inOrder,int left,int right,HashMap<Integer,Integer> map,int[]index){
        if(left>right){
            return null;
        }
        int current=preOrder[index[0]];
        index[0]++;

        TreeNode node = new TreeNode(current);

        if(left==right){
            return node;
        }
        int inorderIndex=map.get(current);

        node.left=helper(preOrder, inOrder, left, inorderIndex-1, map, index);

        node.right=helper(preOrder, inOrder, inorderIndex+1, right, map, index);

        return node;
    }
}