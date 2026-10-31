class BrowserHistory {
   Deque<String> currentHistory=new ArrayDeque<>();
      Deque<String> forwardHistory=new ArrayDeque<>();
    public BrowserHistory(String homepage) {
        // code here
        currentHistory=new ArrayDeque<>();
        forwardHistory=new ArrayDeque<>();
        currentHistory.push(homepage);
        
    }

    public void visit(String url) {
        // code here
        currentHistory.push(url);
        
        while(!forwardHistory.isEmpty()){
            forwardHistory.pop();
        }
        
    }

    public String back(int steps) {
        // code here
        
        while(steps>0){
            if(currentHistory.size()>1){
            String previousTab=currentHistory.pop();
            forwardHistory.push(previousTab);
            steps--;}
            else{
                break;
            }
        }
        return currentHistory.peek();
        
    }

    public String forward(int steps) {
        // code here
        while(steps>0){
            if(forwardHistory.size()>=1){
            String forwardTab=forwardHistory.pop();
            currentHistory.push(forwardTab);
            steps--;
            }else{
                break;
            }
        }
        
        return currentHistory.peek();
        
        
        
    }
}