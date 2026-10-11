class Solution {
    
    static void getSubset(int[] arr, int index, List<Integer> subset, List<List<Integer>> ans){
        if(index>=arr.length){
          ans.add(new ArrayList<>(subset));
          return;
        }
        subset.add(arr[index]);
        getSubset(arr, index+1, subset, ans);
        subset.remove(subset.size()-1);
        getSubset(arr, index+1, subset, ans);
      }
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        
        List<Integer> subset=new ArrayList<>();
              List<List<Integer>> ans=new ArrayList<>();
              getSubset(arr, 0, subset, ans);
              
              ArrayList<Integer> result=new ArrayList<>();
                    for(int i=0; i<ans.size();i++){
                      int sum=0;
                      for(int j=0; j<ans.get(i).size(); j++){
                        sum+=ans.get(i).get(j);
                      }
                      result.add(sum);
                    }
                    Collections.sort(result);
                return result;
        
    }
}