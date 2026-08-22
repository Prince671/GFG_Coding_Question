/* Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node headRef) {
        // code here
        if(headRef==null){
            return headRef;
        }
        
        Node prev=headRef;
        Node current=headRef.next;
        while(current!=null){
            Node forward=current.next;
            if(prev.data == current.data){
                current.prev =null;
                current.next=null;
                current=forward;
                prev.next=forward;
            }else{
                prev=prev.next;
                current=current.next;
            }
        }
        
        return headRef;
    }
}