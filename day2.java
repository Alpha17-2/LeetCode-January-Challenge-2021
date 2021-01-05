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
    static TreeNode ans,current;
    static boolean found=false;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode clone, final TreeNode target) {
        current=clone;
        findPreorder(current,target,found);
        return ans;
    }
    
    public static void findPreorder(TreeNode current,TreeNode target,boolean found)
    {
        if(current==null || found)
            return;
        if(current.val == target.val)
        {
            found=true;
            ans=current;
            return;
        }
        findPreorder(current.left, target, found);
        findPreorder(current.right, target, found);
    }
}