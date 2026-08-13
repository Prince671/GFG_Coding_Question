class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int prefixSum=0;
        for(int val: arr){
            prefixSum+=val;
            ans.add(prefixSum);
        }
        return ans;
    }
}