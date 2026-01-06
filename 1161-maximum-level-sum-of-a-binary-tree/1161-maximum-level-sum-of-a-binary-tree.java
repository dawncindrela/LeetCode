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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        Integer max = null;
        int minLevel = 0;
        int level = 1;
        while (queue.size() > 0) {
            int size = queue.size();
            int localMax = 0;
            while (size > 0) {
                TreeNode node = queue.poll();
                localMax += node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                size--;
            }
            if (max == null || localMax > max) {
                max = localMax;
                minLevel = level;
            }
            level++;
        }
        return minLevel;
    }
}