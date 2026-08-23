/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    static Node reverse(Node prev, Node curr){
        if(curr==null){
            return prev;
        }
        
        Node forward=curr.next;
        curr.next=prev;
        prev=curr;
        curr=forward;
        Node ans=reverse(prev, curr);
        return ans;
    }
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        Node prev=null;
        Node curr=head1;
        head1=reverse(prev, curr);
        Node prev1=null;
        Node curr1=head2;
        head2=reverse(prev1, curr1);
        
        Node ansHead=new Node(-1);
        Node ansTail=ansHead;
        int carry=0;
        while(head1!=null || head2!=null || carry!=0){
            int sum=0;
            
            if(head1!=null){
                sum+=head1.data;
                head1=head1.next;
            
            }
            if(head2!=null){
                sum+=head2.data;
                head2=head2.next;
            }
            
            sum+=carry;
            int digit=sum%10;
            carry=sum/10;
            
            ansTail.next=new Node(digit);
            ansTail=ansTail.next;
            
        }
        
        ansHead=ansHead.next;
    
        prev=null;
        curr=ansHead;
        Node result=reverse(prev, curr);
        while(result != null && result.data == 0 && result.next != null) {
            result = result.next;
        }
        
        return result;
        
        
    }
}