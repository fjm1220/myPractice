//前序遍历（非递归）
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curNode = root;
        while (!stack.isEmpty() || curNode != null) {
            while (curNode != null) {
                //访问根结点元素，并将根结点入栈
                list.add(curNode.val);
                stack.push(curNode);
                curNode = curNode.left;
            }
            //如果为空，取栈顶元素
            curNode = stack.pop();
            curNode = curNode.right;
        }
        return list;
    }

    //中序（非递归）
    public List<Integer> inorderTraversal(TreeNode root)
    {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode curNode = root;
        while(curNode != null || !stack.isEmpty()) {
            while (curNode != null) {
                //一路向左保存结点,直到为空
                stack.push(curNode);
                curNode = curNode.left;
            }
            //如果为空，取出栈顶元素，并访问栈顶元素
            curNode = stack.pop();
            list.add(curNode.val);
            curNode = curNode.right;
        }
        return list;
    }

    //后序（非递归）
    public List<Integer> postorderTraversal(TreeNode root)
    {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode curNode = root;
        TreeNode pre = null;
        while(curNode != null || !stack.isEmpty()) {
            while (curNode != null) {
                stack.push(curNode);
                curNode = curNode.left;
            }
            //curNode = stack.pop();不能直接出栈，因为后面有可能不访问，即else中的情况
            curNode = stack.peek();
            //注意：两种情况
            //1、curNode.right == null 没有右子树
            //2、curNode.right == pre  右子树的根为上一次访问的结点
            if (curNode.right == null || curNode.right == pre) {
                list.add(curNode.val);
                stack.pop();  //此处出栈
                pre = curNode;
                curNode = null;
            } else {
                curNode = curNode.right;
            }
        }
        return list;
    }