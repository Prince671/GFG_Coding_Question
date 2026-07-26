import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        Set<Integer> s = new LinkedHashSet<>();

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                s.add(a[i]);
                i++;
            }
            else if (a[i] > b[j]) {
                s.add(b[j]);
                j++;
            }
            else {
                s.add(a[i]);
                i++;
                j++;
            }
        }

        while (i < a.length) {
            s.add(a[i]);
            i++;
        }

        while (j < b.length) {
            s.add(b[j]);
            j++;
        }

        ArrayList<Integer> arrList = new ArrayList<>();

        for (int val : s) {
            arrList.add(val);
        }

        return arrList;
    }
}