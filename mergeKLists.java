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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<lists.length;i++)
        {
            ListNode temp = lists[i];
            while(temp != null)
            {
                arr.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(arr);
        ListNode ans = new ListNode(-1);
        ListNode tem = ans;
        int n = 0;
        while(n<arr.size())
        {
            //if(n != arr.size())
            tem.next = new ListNode(arr.get(n));
            tem = tem.next;
            n++;
            System.out.println(n+" "+tem.val);
        }
        return ans.next;
    }
}
