class Solution {

      public static void getPreviousSmallerElement(int arr[], int prev[]) {

        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                prev[i] = -1;
            } else {
                prev[i] = st.peek();
            }

            st.push(i);
        }
    }

    // Next Smaller Element
    public static void getNextSmallerElement(int arr[], int next[]) {

        Deque<Integer> st = new ArrayDeque<>();

        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                next[i] = n;
            } else {
                next[i] = st.peek();
            }

            st.push(i);
        }
    }

    // Largest Rectangle in Histogram
    public static int getMaxArea(int arr[]) {

        int n = arr.length;

        int next[] = new int[n];
        int prev[] = new int[n];

        getNextSmallerElement(arr, next);
        getPreviousSmallerElement(arr, prev);

        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            int height = arr[i];

            int width = next[i] - prev[i] - 1;

            int area = height * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
    public int maximalRectangle(char[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int height[] = new int[n];

        int maxArea = 0;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (mat[i][j] == '1') {
                    height[j]++;
                } else {
                    height[j] = 0;
                }
            }

            maxArea = Math.max(maxArea, getMaxArea(height));
        }

        return maxArea;
    }
}

// class Solution {

//     // Previous Smaller Element
  

//     // Maximal Rectangle in Binary Matrix
//     public int maxArea(int mat[][]) {

//         int m = mat.length;
//         int n = mat[0].length;

//         int height[] = new int[n];

//         int maxArea = 0;

//         for (int i = 0; i < m; i++) {

//             for (int j = 0; j < n; j++) {

//                 if (mat[i][j] == 1) {
//                     height[j]++;
//                 } else {
//                     height[j] = 0;
//                 }
//             }

//             maxArea = Math.max(maxArea, getMaxArea(height));
//         }

//         return maxArea;
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna