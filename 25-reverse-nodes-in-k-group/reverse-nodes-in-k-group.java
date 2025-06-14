class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;

        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        
        ListNode beforeGroup = dummy;

        while (true) {
           
            ListNode kth = getKthNode(beforeGroup, k);
            if (kth == null) break;

            
            ListNode afterGroup = kth.next;

            
            ListNode prev = afterGroup;
            ListNode curr = beforeGroup.next;

           
            while (curr != afterGroup) {
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }

            
            ListNode temp = beforeGroup.next; 
            beforeGroup.next = kth;
            beforeGroup = temp; 
        }

        return dummy.next;
    }

    
    private ListNode getKthNode(ListNode node, int k) {
        while (node != null && k > 0) {
            node = node.next;
            k--;
        }
        return node;
    }
}
