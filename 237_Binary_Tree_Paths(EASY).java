/********************
257. Binary Tree Paths


Given a binary tree, return all root-to-leaf paths.

Note: A leaf is a node with no children.

Example:

Input:

   1
 /   \
2     3
 \
  5

Output: ["1->2->5", "1->3"]

Explanation: All root-to-leaf paths are: 1->2->5, 1->3
********************/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ll = new ArrayList<String>();
        if(root == null)
            return ll;
        
        StringBuffer sb = new StringBuffer();
        int arr[]=new int[100];
        pathRecursively(root,ll,arr,0);
        return ll;
    }
    public void pathRecursively(TreeNode root, List<String> ll, int arr[],int pathLen){
        if(root == null)
            return;
        
        arr[pathLen] = root.val;
        pathLen++;
        if(root.left == null && root.right == null){
            StringBuffer sb = new StringBuffer();
            for(int i=0;i<pathLen-1;i++){
                sb.append(arr[i]);
                sb.append("->");
            }
            sb.append(arr[pathLen-1]);
            ll.add(sb.toString());
            return;
        }
        
        pathRecursively(root.left,ll,arr,pathLen);
        pathRecursively(root.right,ll,arr,pathLen);
    }
}