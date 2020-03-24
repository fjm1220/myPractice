//使用栈实现队列的基本操作：
	//因为栈只能从一端进出，而队列是一端进另一端出，
	//所以需要两个栈才能实现队列的基本操作

class MyQueue {
      /** Initialize your data structure here. */
      public MyQueue() {}
      Stack<Integer> stack1 = new Stack<>(); //用于进的栈
      Stack<Integer> stack2 = new Stack<>(); //用于出的栈
      /** Push element x to the back of queue. */
      public void push(int x) {
      stack1.push(x);
      }
      /** Removes the element from in front of queue and returns that element. */
      public int pop() {
      if(!stack2.empty())
      {
          int r = stack2.pop();
          return r;
      }
      else{
            while(!stack1.empty())
            {
                  stack2.push(stack1.pop());
            }
            int r = stack2.pop();
            return r;
      }
      }
      /** Get the front element. */
      public int peek() {
            if(!stack2.empty())
            {
                  int r = stack2.peek();
                  return r;
            }
            else{
                  while(!stack1.empty())
                  {
                        stack2.push(stack1.pop());
                  }
                  int r = stack2.peek();
                  return r;
            }
      }

      /** Returns whether the queue is empty. */
      public boolean empty() {
      if(stack1.empty() && stack2.empty())
      {
            return true;
      }
      return false;
      }
}
