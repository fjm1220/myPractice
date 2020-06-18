//实现一个函数，检查二叉树是否平衡，平衡的定义如下，对于树中的任意一个结点，其两颗子树的高度差不超过1。
import java.util.*;
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class Balance {
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root == null){
            return true;
        }
        int diff = height(root.left)-height(root.right); 
        if(diff > 1 || diff < -1)
        {
           return false;
        }
        return isBalance(root.left)&& isBalance(root.right);
    }
    public static int height(TreeNode root){
        if(root == null)
        {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left,right)+1;
    }
}
