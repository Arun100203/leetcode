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
 import java.util.*;
class Solution {
    public int pairSum(ListNode head) {
        Vector<Integer> vec = new Vector<>();
        while(head != null)
        {
            vec.add(head.val);
            head = head.next;
        }
        int max = Integer.MIN_VALUE;
        for(int i=0, j=vec.size()-1;i<vec.size()/2 && j>=vec.size()/2;i++, j--)
        {
            max = Math.max(max, vec.get(i)+vec.get(j));
        }
        return max;
    }
}
