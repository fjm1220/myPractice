//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//有效字符串需满足：
	//左括号必须用相同类型的右括号闭合。
	//空字符串可被认为是有效字符串。
class Solution
{
      public boolean isValid(String s)
      {
            Stack<Character> stack = new Stack<>();
            char[] ch = s.toCharArray();
			if(s == null)
			{
				return true;
			}
            for(int i = 0;i < ch.length;i++)
            {
                  if(stack.empty())
                  {
                        stack.push(ch[i])
                  }
                  else {
                        char l = stack.peek();
                        char r = ch[i];
                        if ((l == '(' && r == ')') || (l == '[' && r == ']') || (l == '{' && r == '}')) {
                              stack.pop();
                        } else {
                              stack.push(r);
                        }
                  }
            }
            if(stack.empty())
            {
                  return true;
            }
            else{
                  return false;
            }
      }
}