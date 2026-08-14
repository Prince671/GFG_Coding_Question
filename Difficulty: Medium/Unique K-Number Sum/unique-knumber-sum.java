class Solution {

    static void getCombination(
            int[] arr,
            int index,
            int k,
            int n,
            ArrayList<ArrayList<Integer>> ans,
            ArrayList<Integer> combination) {

        // Exactly k numbers selected and target reached
        if (n == 0) {
            if (combination.size() == k) {
                ans.add(new ArrayList<>(combination));
            }
            return;
        }

        if (index >= arr.length || n < 0) {
            return;
        }

        // Include the value
        combination.add(arr[index]);

        getCombination(
            arr,
            index + 1,
            k,
            n - arr[index],
            ans,
            combination
        );

        // Backtrack
        combination.remove(combination.size() - 1);

        // Exclude the value
        getCombination(
            arr,
            index + 1,
            k,
            n,
            ans,
            combination
        );
    }

    public ArrayList<ArrayList<Integer>> combinationSum(int n, int k) {
        // code here int[] arr = new int[9];
         int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = i + 1;
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> combination = new ArrayList<>();

        getCombination(arr, 0, k, n, ans, combination);
        return ans;
        
    }
}