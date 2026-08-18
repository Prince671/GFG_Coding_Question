class Solution {
    public int gcd(int n, int arr[]) {

        int result = arr[0];

        for(int i = 1; i < n; i++) {

            int a = result;
            int b = arr[i];

            while(b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }

            result = a;
        }

        return result;
    }
}