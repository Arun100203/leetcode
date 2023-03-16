class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp = new ListNode(-1);
        ListNode prev = temp;
        if(head == null || head.next == null)
        return head;
        ListNode first = head;
        ListNode second = head.next;
        while(second != null)
        {
            ListNode nextPointer = second.next;
            prev.next = second;
            first.next = nextPointer;
            second.next = first;
            if(nextPointer == null)
            break;
            prev = first;
            first = nextPointer;
            second = nextPointer.next; 
        }
        return temp.next;
    }
}
