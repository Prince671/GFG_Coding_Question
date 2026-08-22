class Solution {
    public Node rotateDLL(Node head, int k) {

        if(head == null || head.next == null || k == 0) {
            return head;
        }

        Node temp = head;
        int len = 1;

        // Find the tail and length
        while(temp.next != null) {
            len++;
            temp = temp.next;
        }

        k = k % len;

        if(k == 0) {
            return head;
        }

        // Make the DLL circular
        temp.next = head;
        head.prev = temp;

        temp = head;

        // Move to kth node
        for(int i = 1; i < k; i++) {
            temp = temp.next;
        }

        // New head
        Node forward = temp.next;

        // Break the circular connection
        temp.next = null;
        forward.prev = null;

        return forward;
    }
}