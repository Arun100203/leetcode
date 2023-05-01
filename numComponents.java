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
    public int numComponents(ListNode head, int[] nums) {
        ListNode temp = head;
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int comp = 0;
        while(temp!=null){
            int watch = 0;
            while(set.contains(temp.val)){
                watch++;
                if(temp.next == null){
                    break;
                }
                temp = temp.next;
            }
            temp = temp.next;
            if(watch>0) comp++;
        }
        return comp;
    }
}
