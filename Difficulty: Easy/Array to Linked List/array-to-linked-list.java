/* Linked List Node Structure
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
    public Node arrayToList(int arr[]) {
        // code here
        Node current=new Node(arr[0]);
        Node dummy=new Node(-1);
        dummy.next=current;
        
        for(int i=1; i<arr.length; i++){
            current.next=new Node(arr[i]);
            current=current.next;
        }
        return dummy.next;
    }
}
