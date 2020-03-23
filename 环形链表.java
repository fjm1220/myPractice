//给定一个链表，判断链表中是否有环。

//方法一：时间复杂度O(n) 空间复杂度O(n)
public class Solution
{
      public boolean hasCycle(ListNode head)
      {
            List<ListNode> list = new LinkedList<>();
            ListNode cur = head;
            while(cur != null)
            {
                  list.add(cur);
                  if(list.contains(cur.next))
                  {
                        return true;
                  }
                  cur = cur.next;
            }
            return false;
      }
}

//方法二：快慢指针,fast走两步，slow走一步
		//时间复杂度O(n),空间复杂度O(1)
public class Solution
{
      public boolean hasCycle(ListNode head)
      {
            if(head == null || head.next == null)
            {
                  return false;
            }
            ListNode slow = head;
            ListNode fast = head.next;
            while(slow != fast)
            {
                  if(fast == null || fast.next == null)
                  {
                        return false;
                  }
                  slow = slow.next;
                  fast = fast.next.next;
            }
            return true;
      }
}