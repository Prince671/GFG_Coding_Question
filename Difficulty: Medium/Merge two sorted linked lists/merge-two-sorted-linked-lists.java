/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node a=head1;
        Node b=head2;
        
        Node ansHead=new Node(-1);
        Node ansTail=ansHead;
        
        while(a!=null && b!=null){
            if(a.data<b.data){
                ansTail.next=a;
                ansTail=a;
                a=a.next;;
            }
            else{
                ansTail.next=b;
                ansTail=b;
                b=b.next;
                
            }
        }
        while(a!=null){
            ansTail.next=a;
            ansTail=a;
            a=a.next;
        }
        while(b!=null){
            ansTail.next=b;
            ansTail=b;
            b=b.next;
        }
        
        ansHead=ansHead.next;
        return ansHead;
    }
}