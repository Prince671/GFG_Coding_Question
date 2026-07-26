import java.util.HashSet;

class Solution {
    int missingNum(int arr[]) {

        HashSet<Integer> set = new HashSet<>();

        for (int val : arr) {
            set.add(val);
        }

        int target = 1;

        while (true) {
            if (!set.contains(target)) {
                return target;
            }
            target++;
        }
    }
}