import java.util.Arrays;
public class SortingProblems {
    public static void main(String[] args) {
        // sorting in decending order
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        // bubbleSort(arr);
        //selectionSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        for (int turn = 0; turn < arr.length-1; turn++) {
            int swapped=0;
            for (int j = 0; j <arr.length-1-turn ; j++) {
                if (arr[j]<arr[j+1]){
                    swap(arr,j,j+1);
                    swapped++;
                }
            }if (swapped==0){
                break;
            }
        }
    }
    static void selectionSort(int[] arr){
        for (int turn = 0; turn < arr.length-1; turn++) {
            int start = turn;
            int end = arr.length-1;
            int maxIndex = getMaxIndex(arr, start, end);
            swap(arr, start, maxIndex);

        }
    }
    static void insertionSort(int[] arr){
        for (int turn = 0; turn < arr.length-1; turn++) {
            for (int j = turn+1; j >0; j--) {
                if (arr[j]>arr[j-1]){
                    swap(arr, j, j-1);
                }else {
                    break;
                }
            }

        }
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start+1; i <end+1 ; i++) {
            if (arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[]arr, int start, int end){
        int temp = arr[start];
        arr[start]= arr[end];
        arr[end] = temp;
    }


}
