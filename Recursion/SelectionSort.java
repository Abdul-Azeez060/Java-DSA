public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selection(arr,arr.length, 0, 0);
    }

     static void selection(int[] arr, int r, int c, int m ) {
        if (r == 1) {
            return;
        }
        if (r > c) {
            if (arr[c] > arr[m]) {
                m = c;
            }
           selection(arr, r, c+1, m);
        }
        else {
            // swap the max index with the last index
            int temp = arr[m];
            arr[m] = arr[r-1];
            arr[r-1] = temp;
            selection(arr, r-1, 0, 0);
        }
    }
}
