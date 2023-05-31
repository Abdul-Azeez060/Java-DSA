import java.util.Arrays;

public class ArrayBackTrack {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arrFill(arr, 0 , 1);
        System.out.println(Arrays.toString(arr));
    }

     static void arrFill(int[] arr, int i, int val) {
        // base condition
        if (i == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        // recursive condition
         arr[i] = val;
        arrFill(arr, i+1, val+1);
        arr[i] = val - 2 ;

    }
}
