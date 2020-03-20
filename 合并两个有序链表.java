//合并两个有序链表
class Solution
{
      public ListNode mergeTwoLists(ListNode l1, ListNode l2)
      {
      ListNode cur1 = l1;
      ListNode cur2 = l2;
      ListNode result = new ListNode(0);
      ListNode pre = result;
      if(l1 == null)
      {
            return l2;
      }
      if(l2 == null)
      {
            return l1;
      }
      //此时l1,l2都不为空
      while(cur1 != null && cur2 != null)
      {
            if(cur1.val <= cur2.val)
            {
                  pre.next = cur1;
                  pre = cur1;
                  cur1 = cur1.next;
            }
            else
            {
                  pre.next = cur2;
                  pre = cur2;
                  cur2 = cur2.next;
            }
      }
      if(cur1 == null)
      {
            //将l2剩余部分拼接在result后面
            pre.next = cur2;
            return result.next;
      }
      if(cur2 == null) //cur1 != null cur2 == null
      {
         pre.next = cur1;
         return result.next;
      }
      return result.next;
      }
}