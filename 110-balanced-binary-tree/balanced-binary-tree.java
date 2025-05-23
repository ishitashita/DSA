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
    public int balancedHeight(TreeNode root  ){
        if(root== null)return 0;
        int left = balancedHeight(root.left);
        int right = balancedHeight(root.right);
        return Math.max(left, right)+1;
        
        }
    public boolean isBalanced(TreeNode root) {
        if(root == null)return true;
        int left = balancedHeight(root.left);
        int right = balancedHeight(root.right);
        if(Math.abs(left-right)>1)return false;
        else return isBalanced(root.left) && isBalanced(root.right);


        

        
    }
}