//给定一个二叉树，返回它的前序遍历。
 public class TreeNode {
     int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
 
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
 List<Integer> list = new ArrayList<>();
        if(root == null)
        {
            return list;
        }
        else
        {
            list.add(root.val);
            list.addAll(preorderTraversal(root.left));
            list.addAll(preorderTraversal(root.right));
        }
        return list;
    }
}