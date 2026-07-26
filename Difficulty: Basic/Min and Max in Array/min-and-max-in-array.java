class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int val : arr) {
            if (val > max) {
                max = val;
            }
            if (val < min) {
                min = val;
            }
        }

        ArrayList<Integer> a = new ArrayList<>();
        a.add(min);
        a.add(max);

        return a;
    }
}