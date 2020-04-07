 //判断一棵树是否是平衡二叉树
    public boolean isBalanced(TreeNode root)
    {
        if(root == null)
        {
            return true;
        }
        else
            {
            int l = maxDepth(root.left);
            int r = maxDepth(root.right);
            int differ = l - r; //满足条件的differ = 0,1，-1
            if(differ < -1 || differ > 1)
            {
                return false;
            }
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
	
	   public int maxDepth(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        else
        {
            return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
        }
    }


    //另一棵树的子树
    public boolean isSubtree(TreeNode s, TreeNode t)
    {
        if(s == null && t == null)
        {
            return true;
        }
        if(s == null || t == null)
        {
            return false;
        }
        if(isSameTree(s,t))
        {
            return true;
        }
        else
        {
            return isSubtree(s.left,t) || isSubtree(s.right,t);
        }
    }
    public  boolean isSameTree(TreeNode p,TreeNode q)
    {
        if(p == null && q == null)
        {
            return true;
        }
        if(p == null || q == null)
        {
            return false;
        }
        if(p.val != q.val)
        {
            return false;
        }
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}