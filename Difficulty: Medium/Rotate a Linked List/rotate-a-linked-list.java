class Solution {
    public Node rotate(Node head, int k) {

        if(head == null || head.next == null || k == 0) {
            return head;
        }

        // Find length and tail
        Node temp = head;
        int len = 1;

        while(temp.next != null) {
            temp = temp.next;
            len++;
        }

        // Avoid unnecessary rotations
        k = k % len;

        if(k == 0) {
            return head;
        }

        // Make circular linked list
        temp.next = head;

        // Move to the kth node
        temp = head;

        for(int i = 1; i < k; i++) {
            temp = temp.next;
        }

        // New head is next node after kth node
        Node forward = temp.next;

        // Break the circular list
        temp.next = null;

        return forward;
    }
}