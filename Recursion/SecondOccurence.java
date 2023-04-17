public class SecondOccurence {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 8, 4};
        int target = 4;
        System.out.println(secondOccurence(arr, target, 0));
    }

     static int secondOccurence(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        int f = secondOccurence(arr, target, i+1);
        if (f == -1 && arr[i] == target) {
            return i;
        }

        return f;
    }

}
