/********************
572. Subtree of Another Tree

Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. 
A subtree of s is a tree consists of a node in s and all of this node's descendants. 
The tree s could also be considered as a subtree of itself.

Example 1:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
    /
   0
Given tree t:
   4
  / \
 1   2
Return false.
********************/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null && t == null)
            return false;
        if(s == null || t == null)
            return false;

        
       Queue<TreeNode> q = new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()){
            TreeNode current = q.poll();
            if(current.val == t.val && symmetrical(current,t)){
                return true;
            }
            if(current.left != null)
                q.add(current.left);
            if(current.right != null)
                q.add(current.right);
        }
        return false;
        
    }
    
    public boolean symmetrical(TreeNode s, TreeNode t){
        if(s == null && t == null)
            return true;
        if(s == null || t == null)
            return false;
        if(s.val == t.val)
            return symmetrical(s.left,t.left) && symmetrical(s.right,t.right);
        else
            return false;
    }
}