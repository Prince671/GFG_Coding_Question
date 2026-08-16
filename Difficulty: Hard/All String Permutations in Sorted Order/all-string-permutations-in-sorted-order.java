class Solution {
    static void getPermutation(String s, ArrayList<String> ans, String output){
        if(s.isEmpty()){
            ans.add(output);
            return;
        }
        
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            String remainingString=s.substring(0, i)+s.substring(i+1);
            getPermutation(remainingString, ans, output+ch);
        }
            
    }
    public ArrayList<String> permutation(String s) {
        // code here
        ArrayList<String> ans=new ArrayList<>();
        getPermutation(s, ans, "");
        Collections.sort(ans);
        return ans;
        
    }
}