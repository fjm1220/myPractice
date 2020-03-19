class Solution
{
    public ListNode reverseList(ListNode head)
    {
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null)
        {
            ListNode nextNode = cur.next;
            cur.next = pre;  //cur一旦指向前一个结点，后面的指向就丢失了，所以需要先保存cur的下一个结点
            pre = cur;
            cur = nextNode;
        }
        return pre;   
    }
