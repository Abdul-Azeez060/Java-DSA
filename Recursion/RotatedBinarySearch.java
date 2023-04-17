public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 1, 2, 3, 4};
        int key = 8;
        int s = 0;
        int e = arr.length-1;
        System.out.println(rbs(arr, key, s, e));
    }

    static int rbs(int[] arr, int key, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e-s) / 2;
        if (arr[m] == key) {
            return m;
        }
        if (arr[s] <= arr[m]) {
            if (arr[s] <= key && key <= arr[m]) {
               return rbs(arr, key, s, m-1);
            }
            else {
                return rbs(arr, key, m+1, e);
            }
        }
        if (arr[s] > arr[m]) {
            if (key >= arr[m] && key <= arr[e]) {
                return rbs(arr, key, m+1, e);
            }
        }
        return rbs(arr, key, s, m-1);
    }
}
