//找到两个单链表相交的起始节点。
	//首先要消除两个链表的距离

public class Solution
{
      public ListNode getIntersectionNode(ListNode headA, ListNode headB)
      {
            ListNode cur1 = headA;
            ListNode cur2 = headB;
            if(cur1 == null || cur2 == null)
            {
                  return null;
            }
            //避免死循环
          while(cur1 != cur2)
          {
                if(cur1 == null && cur2 != null)
                {
                      cur1 = headB;
                      cur2 = cur2.next;
                }
                else if(cur2 == null && cur1 != null)
                {
                      cur2 = headA;
                      cur1 = cur1.next;
                }
                else
                 {
                      cur1 = cur1.next;
                      cur2 = cur2.next;
                 }
          }
          if(cur1 == null && cur2 == null)
          {
                return null;
          }
          return cur1;
      }
}