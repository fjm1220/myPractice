//以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前

//注意：分割以后保持原来的数据顺序不变。
	//新建连个链表；小于x的放在一个链表中；大于x的放在一个链表中
	//合并两个链表
	//最后一定要使最后一个结点的next为空

public class Partition
{
      public ListNode partition(ListNode pHead, int x)
      {
           ListNode small = new ListNode(0);
           ListNode last_S = small;
           ListNode big = new ListNode(0);
           ListNode last_B = big;
           ListNode cur = pHead;
           while(cur != null)
           {
                 if(cur.val < x)
                 {
                       last_S.next = cur;
                       last_S = cur;
                       cur = cur.next;
                 }
                 else
                 {
                       last_B.next = cur;
                       last_B = cur;
                       cur = cur.next;
                 }
           }
          last_B.next = null;  //注意！！！
          last_S.next = big.next;
           return small.next;
      }
}