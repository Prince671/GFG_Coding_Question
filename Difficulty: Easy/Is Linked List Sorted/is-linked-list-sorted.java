/* Structure of linked list Node
class Node {
    public int data;
    public Node next;

    public Node(int x) {
        data = x;
        next = null;
    }
};*/

class Solution {
    static boolean isAseceding(Node head){
      int val=head.data;
       Node temp=head.next;
        while(temp!=null){
            if(temp.data<val){
                return false;
            }
            val=temp.data;
            temp=temp.next;
        }
        return true;  
    }
    
    static boolean isDecending(Node head){
        int val=head.data;
        Node temp=head.next;
        while(temp!=null){
            if(temp.data>val){
                return false;
            }
            val=temp.data;
            temp=temp.next;
        }
        return true;
    }
    public boolean isSorted(Node head) {
        // code here
       return isAseceding(head) || isDecending(head);
    }
}