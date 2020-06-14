//有两个用链表表示的整数，每个结点包含一个数位。
//这些数位是反向存放的，也就是个位排在链表的首部。编写函数对这两个整数求和，并用链表形式返回结果。

    //思路：直接使用遍历结点非常复杂；可以将链表遍历转化为整数，进行相加，再将结果放在链表中
    //中间涉及到String到int的转换：Integer.parseInt()
    //StringBuilder到String的转换：toString()
    //int到String：String.valueOf()

import java.util.*;
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        int num1 = nodeToInt(a);
        int num2 = nodeToInt(b);
        int num = num1+num2;
        return intToNode(num);
    }
    private int nodeToInt(ListNode n)
    {
        StringBuilder s = new StringBuilder();
        ListNode cur = n;
        while(cur != null)
        {
          //注意：StringBuilder要用append()进行拼接
           // s = s+cur.val;
            s.append(cur.val);
            cur = cur.next;
        }
        //注意：要将StringBuilder转为String
        return Integer.parseInt(s.reverse().toString());
    }
    private ListNode intToNode(int m)
    {
         ListNode list = new ListNode(0);
        list.next = null;
        ListNode last = list;
        char[] ch = String.valueOf(m).toCharArray();
        for(int i = ch.length-1;i >=0;i--)
        {
            ListNode p = new ListNode(ch[i]-'0');
            p.next = last.next;
            last.next = p;
            last = last.next;
        }
        return list.next;
    }
}
