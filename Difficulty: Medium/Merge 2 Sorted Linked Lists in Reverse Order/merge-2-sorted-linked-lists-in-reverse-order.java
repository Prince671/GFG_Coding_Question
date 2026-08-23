/* Structure of a linked list Node
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
};*/

class Solution {
    static Node reverseLL(Node prev, Node curr){
        if(curr==null){
            return prev;
        }
        
        Node forward=curr.next;
        curr.next=prev;
        prev=curr;
        curr=forward;
        
        return reverseLL(prev, curr);
    }
    public Node mergeResult(Node head1, Node head2) {
        // code here
        Node prev=null;
        Node curr=head1;
        head1=reverseLL(prev, curr);
        Node prev1=null;
        Node curr1=head2;
        head2=reverseLL(prev1, curr1);
        
        Node ansHead=new Node(-1);
        Node ansTail=ansHead;
        
        while(head1!=null && head2!=null){
            if(head1.data> head2.data){
                ansTail.next=head1;
                ansTail=head1;
                head1=head1.next;
            }
            else{
                ansTail.next=head2;
                ansTail=head2;
                head2=head2.next;
            }
        }
        
        while(head1!=null){
             ansTail.next=head1;
                ansTail=head1;
                head1=head1.next;
        }
        
        while(head2!=null){
                ansTail.next=head2;
                ansTail=head2;
                head2=head2.next;
        }
        
        ansHead=ansHead.next;
        return ansHead;
    }
}