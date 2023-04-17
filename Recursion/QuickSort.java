import java.util.Arrays;

// best case time complexity is O(n*logn) and SP is O(1)
// worst case is O(n^2) if pivot is the largest or the smallest element
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int low = 0, high = arr.length-1;
        quickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2; // pivot
        while (s <= e) {
            while (arr[s] < arr[m]) {
                s++;
            }
            while (arr[e] > arr[m]) {
                e--;
            }
            if (s <= e) {
                // swap
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }
}
