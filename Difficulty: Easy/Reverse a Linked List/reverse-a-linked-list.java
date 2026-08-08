class Solution {
    Node reverseList(Node head) {

        ArrayList<Integer> a = new ArrayList<>();

        Node current = head;

        while (current != null) {
            a.add(current.data);
            current = current.next;
        }

        Node temp = head;
        int i = a.size() - 1;

        while (temp != null) {
            temp.data = a.get(i);
            temp = temp.next;
            i--;
        }

        return head;
    }
}