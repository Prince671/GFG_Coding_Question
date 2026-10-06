/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/implement-two-stacks-in-an-array/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class twoStacks {
    int[] arr = new int[100];
    int size = 100;
    int top1, top2;

    twoStacks() {
        // Initialize the top pointers of both stacks
        top1=-1;
        top2=100;
        
    }

    void push1(int x) {
        // Insert the given element at the top of the first stack
        if(top1>=top2){
            return;
        }
        
        top1++;
        arr[top1]=x;
        
    }

    void push2(int x) {
        // Insert the given element at the top of the second stack
        
        if(top2<=top1){
            // System.out.printl("Stack Overflow");
            return;
        }
        top2--;
        arr[top2]=x;
        
    }

    int pop1() {
        // Remove and return the top element of the first stack
        // Return -1 if the stack is empty
        if(top1==-1){
            return -1;
        }
        
        int x=arr[top1];
        top1--;
        return x;
        
    }

    int pop2() {
        // Remove and return the top element of the second stack
        // Return -1 if the stack is empty
        
        if(top2==100){
            return -1;
        }
        int x=arr[top2];
        top2++;
        return x;
    }
}
