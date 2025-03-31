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
    public int getDecimalValue(ListNode head) {
        String res = "";
        ListNode temp = head;
        while(temp!=null){
            res = res+ String.valueOf(temp.val);
            temp = temp.next;
        }
        int ans = Integer.parseInt(res,2);
        return ans;
    }
}