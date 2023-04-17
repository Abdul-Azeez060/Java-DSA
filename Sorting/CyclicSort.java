import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        // givren an array in the range of 1 to N(N=5) or given in a range 0 to n .
        int[] arr = {3, 5, 2, 1, 4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correctIndex = arr[i]-1;
            if (arr[i]==arr[correctIndex]){
                i++;
            }else {
                swap(arr,i,correctIndex);
            }
        }

    }

    static void swap(int[]arr,int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }

}
