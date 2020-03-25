import java.util.Scanner;

public class MyArrayStack
{
    public static void main(String[] args) {
        MyStack stack = new MyStack(4);
        boolean loop = true;
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        while(loop)
        {
            System.out.println("push:入栈");
            System.out.println("pop:出栈");
            System.out.println("isEmpty:判断栈是否为空");
            System.out.println("isFoll:判断栈是否满");
            System.out.println("peek:查看栈顶元素");
            System.out.println("exit:退出菜单");
            String key = in.nextLine();
            switch(key)
            {
                case "push":
                    System.out.println("请输入要入栈的数据");
                    int a = sc.nextInt();
                    stack.push(a);
                    break;
                case "pop":
                    stack.pop();
                    break;
                case "isEmpty":
                    System.out.println(stack.isEmpty());
                    break;
                case "isFull":
                    System.out.println(stack.isFull());
                    break;
                case "peek":
                    System.out.println(stack.peek());
                    break;
                case "exit":
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }
}
class MyStack
{
    //属性
    private int Maxsize;
    private int top = -1;
    private int[] arr;
    //构造方法
    public MyStack(int MaxSize)
    {
        this.Maxsize = MaxSize;
        arr = new int[MaxSize];
    }
    //判断栈空
    public boolean isEmpty()
    {
        if(top == -1)
        {
            return true;
        }
        return false;
    }
    //判断栈满
    public boolean isFull()
    {
    if(top == Maxsize-1)
    {
        return true;
    }
    return false;
    }
    //入栈
    public void push(int val)
    {
        //判断栈是否为满
        if(isFull())
        {
            System.out.println("栈满了");
            return;
        }
        top++;
        arr[top] = val;
    }
    //出栈
    public void pop()
    {
        //判断栈是否为空
        if(isEmpty())
        {
            System.out.println("栈为空");
            return;
        }
        top--;
    }
    //栈顶元素
    public int peek()
    {
        return arr[top];
    }
}
