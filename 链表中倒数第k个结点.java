//输出倒数第K个结点

//方法一：两次遍历
      //第一次遍历求出链表长度
      //第二次遍历：倒数第k个结点为正数第len-k+1个

public class Solution
{
      public ListNode FindKthToTail1(ListNode head,int k)
      {
            //求链表长度
            ListNode cur = head;
            int len = 0;
            while(cur != null)
            {
                  len++;
                  cur = cur.next;
            }
            //当k>len时返回null
            if(k > len)
            {
                  return null;
            }
            //倒数第k个结点为正数第len-k+1个结点
            ListNode curt = head;
            for(int i = 1; i < len-k+1;i++)  //注意i从1开始，i < len-k+1
            {
                  curt = curt.next;
            }
            return curt;
     }
}

//方法二：快慢指针
      //让快指针fast先走k步，此时 快指针(fast)-慢指针(slow) == k
      //然后快慢指针一起走，当fast走到null时，slow为倒数第k个结点
public class Solution
{
      public ListNode FindKthToTail(ListNode head,int k)
      {
      ListNode fast = head;
      ListNode slow = head;
      int step = 0;
      while(fast != null && step != k)
      {
            fast = fast.next;
            step++;
      }
      if(fast == null && step != k)
      {
            //说明k大于链表长度
            return null;
      }
      while(fast != null)
      {
          fast = fast.next;
          slow = slow.next;
      }
      return slow;
      }
}
