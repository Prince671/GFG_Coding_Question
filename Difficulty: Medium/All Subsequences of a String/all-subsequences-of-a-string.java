class Solution {
    static void getSubsequence(String s, int index, List<String> ans, StringBuilder output){
        if(index>=s.length()){
            String result=output.toString();
            ans.add(result);
            return ;
        }
        
        char ch=s.charAt(index);
        // include
        output.append(ch);
        // calling the funtion while including 
        getSubsequence(s, index+1, ans, output);
        //exclude 
        output.deleteCharAt(output.length() - 1); // Deleting the character beacuse i want to make a exclude call
        //calling the function while excluding 
        getSubsequence(s, index+1, ans, output);
        
        
    }
    public List<String> powerSet(String s) {
        // Code here
        List<String> ans=new ArrayList<>();
        StringBuilder output =new StringBuilder();
        int index=0;
        
        getSubsequence(s, index, ans, output);
        Collections.sort(ans);
        return ans;
    }
}