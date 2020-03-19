//给定一个带有头结点 head 的非空单链表，返回链表的中间结点。

//如果有两个中间结点，则返回第二个中间结点。

 
//思路：利用快慢指针，快指针前进的速度为慢指针的两倍时，当快指针到达最后一个结点时，慢指针就为中间结点
		//当链表结点数为奇数时fast.next == null结束；
		//结点数为偶数时fast == null结束
class Solution
{
    public ListNode middleNode(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}