class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        int freq[]=new int[26];
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        
        int maxFreq=-1;
        char ans='a';
        
        for(int i=0; i<26; i++){
            if(freq[i]>maxFreq){
                maxFreq=freq[i];
                ans=(char)(i+'a');
            }
        }
        return ans;
    }
}