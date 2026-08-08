class Solution {
    public int thirdLargest(List<Integer> arr) {

        int max = Integer.MIN_VALUE;
        int sMx = Integer.MIN_VALUE;
        int tMx = Integer.MIN_VALUE;
        if(arr.size()<3){
            return -1;
        }

        for (int val : arr) {

            if (val > max) {
                tMx = sMx;
                sMx = max;
                max = val;
            }
            else if (val > sMx && val <= max) {
                tMx = sMx;
                sMx = val;
            }
            else if (val > tMx && val <= sMx) {
                tMx = val;
            }
        }

        return tMx;
    }
}