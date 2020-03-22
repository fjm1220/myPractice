public class PalindromeList
{
    public boolean chkPalindrome(ListNode A)
    {
        // write code here
         ListNode result = new ListNode(0);
         result.next = null;
         ListNode cur = A;
         while(cur != null)
         {
         ListNode cur_next = cur.next;
         cur.next = result.next;
         result.next = cur;
         cur = cur_next;
         }
         ListNode p1 = A;
         ListNode p2 = result.next;
         while(p1 != null)
         {
             if(p1.val != p2.val)
             {
                 return false;
             }
             p1 = p1.next;
             p2 = p2.next;
         }
         return true;
    }
}