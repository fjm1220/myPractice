class ListNode
{
      int val;
      ListNode next;
      public ListNode(int x)
      { this.val = x; }
}
public class Solution
{
        public ListNode removeElements(ListNode head, int val)
        {
            //头结点没有前继结点，需单独处理；设置虚拟头结点，可以不用单独处理头结点。
			ListNode header = new ListNode(0); 
            node.next = head;
            ListNode pre = header;
            ListNode cur = head;
            while(cur != null)
            {
                if(cur.val == val)
                {
                    pre.next = cur.next;
                    cur = cur.next;
                }
                else
                {
                    pre = cur;
                    cur = cur.next;
                }
            }
            return header.next;
        }
 }
