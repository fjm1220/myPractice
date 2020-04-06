//判断两棵树是否相同
    public boolean isSameTree(TreeNode p, TreeNode q)
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
        //对左右子树进行相同的递归
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
//二叉树最大深度
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