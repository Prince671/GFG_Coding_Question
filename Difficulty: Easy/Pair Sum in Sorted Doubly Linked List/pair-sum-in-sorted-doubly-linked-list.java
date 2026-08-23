/* Structure of Doubly Linked List Node
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}; */

class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
        // code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        ArrayList<Integer> output =new ArrayList<>();
        int len=1;
        Node front=head;
        Node back=head;
        while(back.next!=null){
            len++;
            back=back.next;
        }
        
        int x=1;
        int y=len;
        while(x<y  && (front!=null && back!=null)){
            if((front.data+back.data)==target){
                output.add(front.data);
                output.add(back.data);
                result.add(new ArrayList<>(output));
                output.clear();
                x++;
                y--;
                front=front.next;
                back=back.prev;
            }
            else if((front.data+back.data)>target){
                y--;
                back=back.prev;
            }
            else{
                x++;
                front=front.next;
            }
           
        }
        return result;
    }
}