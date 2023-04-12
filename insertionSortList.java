/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        List< Integer> li = new ArrayList<>();
        while(head != null)
        {
            li.add( head.val);
            head = head.next;
        }
        ListNode dum = new ListNode(-1);
        ListNode ans = dum;
        Collections.sort(li);
        System.out.println(li);
        for(int i: li)
        {
            dum.next = new ListNode(i);
            dum = dum.next;
        }
        return ans.next;
    }
}
