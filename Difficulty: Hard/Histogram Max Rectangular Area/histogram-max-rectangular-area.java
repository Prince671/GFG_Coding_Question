class Solution {

    public static void findPreviousSmallerElement(int arr[], int prev[]) {

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

    public static void findNextSmallerElement(int arr[], int next[]) {

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

    public static int getMaxArea(int arr[]) {

        int n = arr.length;

        int next[] = new int[n];
        int prev[] = new int[n];

        findNextSmallerElement(arr, next);
        findPreviousSmallerElement(arr, prev);

        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            int height = arr[i];

            int width = next[i] - prev[i] - 1;

            int area = height * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}