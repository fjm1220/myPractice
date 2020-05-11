//对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
//给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。

import java.util.*;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        Stack<Character> stack = new Stack<>();
        char[] arr = A.toCharArray();
        int i = 0;
        int len = arr.length;
        while(i < len)
        {
            if(stack.isEmpty())
            {
                stack.push(arr[i]);
                i++;
            }
            else{
                char ch = stack.peek();
                if((ch == '(' && arr[i] == ')'))
                {
                    stack.pop();
                    i++;
                }
                else{
                    stack.push(arr[i]);
                    i++;
                }
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        return false;
    }
}
