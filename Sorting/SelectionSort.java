import java.util.Arrays;
// used for smaller arrays
// selecting an element from unsorted array and swaping it with the correct index
// O(n^2)

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 3, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length-1-i;
            int maxIndex = getMax(arr,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
    }
    static void swap(int[]arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int getMax(int[] arr, int lastIndex) {
        int max = 0;
        for (int i = 1; i <= lastIndex; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
