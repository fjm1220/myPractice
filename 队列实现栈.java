//队列实现栈
	//方法一：一个队列实现栈
class MyStack {

      /** Initialize your data structure here. */
      public MyStack() {
      }
     Queue<Integer> q = new LinkedList();
      /** Push element x onto stack. */
      public void push(int x)
      {
            q.add(x);
      }

      /** Removes the element on top of the stack and returns that element. */
      public int pop() {
      for(int i = 0;i < q.size()-1;i++)
      {
            int a = q.peek();
            q.poll(a);
            q.add(a);
      }
      int r = q.peek();
      q.remove(r);
      return r;
      }

      /** Get the top element. */
      public int top() {
            for(int i = 0;i < q.size()-1;i++)
            {
                  int a = q.peek();
                  q.poll();
                  q.add(a);
            }
            int r = q.peek();
			q.remove();
            q.add(r);
            return r;
      }

      /** Returns whether the stack is empty. */
      public boolean empty() {
      if(q.isEmpty())
      {
            return true;
      }
      return true;
      }
}

	//方法二：两个队列实现栈
class MyStack 
{
    /** Initialize your data structure here. */
    public MyStack() {}
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    /** Push element x onto stack. */
 public void push(int x) 
 {
	if(!q1.isEmpty())
      {
         q1.add(x);
      }
      else
      {
         q2.add(x);
      }
 }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop()
	{
	if(!q1.isEmpty())
      {
          while(q1.size() > 1)
          {
             int a = q1.peek();
             q1.remove();
             q2.add(a);
          }
            int r = q1.peek();
            q1.remove();
            return r;
      }
     else
	 {
        while(q2.size() > 1)
        {
         int a = q2.peek();
         q2.remove();
         q1.add(a);
         }
         int r = q2.peek();
         q2.remove();
         return r;
     }
  }
    
    /** Get the top element. */
public int top()
{
	if(!q1.isEmpty())
     {
		while(q1.size() > 1)
        {
         int a = q1.peek();
         q1.remove();
         q2.add(a);
         }
        int r = q1.peek();
        q1.remove();
		//注意要将栈顶元素再添加回去，因为不是删除
        q2.add(r);
        return r;
     }
    else
	{
      while(q2.size() > 1)
      {
        int a = q2.peek();
        q2.remove();
        q1.add(a);
       }
        int r = q2.peek();
        q2.remove();
        q1.add(r);
        return r;
      }
}
    
    /** Returns whether the stack is empty. */
 public boolean empty() 
 {
	if(q1.isEmpty() && q2.isEmpty())
	{
	return true;
	}
	else
	{
	return false;
	}
 }
}


