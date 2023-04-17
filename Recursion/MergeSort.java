// time complexity is O(n*logn) and space complexity is O(n) taking extra temp arraylist space
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int s = 0;
        int e = arr.length-1;
        mergeSort(arr, s, e);
        System.out.println(Arrays.toString(arr));
    }

     static void mergeSort(int[] arr, int low, int high) {
        if (low == high) {
            return;
        }
        int m = (low+high) / 2;
        mergeSort(arr, low, m);
        mergeSort(arr, m+1, high);
        merge(arr, low, high, m);
    }

     static void merge(int[] arr, int  low , int high, int m) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = low;
        int j = m+1;
        while (i <= m && j <= high) {
            if (arr[i] > arr[j]) {
                temp.add(arr[j]);
                j++;
            } else {
                temp.add(arr[i]);
                i++;
            }
        }
    while (i <= m) {
        temp.add(arr[i]);
        i++;
    }
    while (j <= high) {
        temp.add(arr[j]);
        j++;

    }
        for (int k = low; k <=high; k++) {
            arr[k] = temp.get(k - low);
        }
    }
}
