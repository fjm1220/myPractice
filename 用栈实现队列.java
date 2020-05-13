import java.util.Stack;

//用两个栈实现队列
public class Main17{
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    //入队列
    public void Push(int n)
    {
        stack1.push(n);
    }
    //出队列
    public int Pop()
    {
        if(stack1.isEmpty() && stack2.isEmpty())
        {
            //抛异常
            throw new RuntimeException("队列为空");
        }
       if(stack2.isEmpty())
       {
           while(!stack1.isEmpty())
           {
               stack2.push(stack1.pop());
           }
       }
       return stack2.pop();
    }
}
