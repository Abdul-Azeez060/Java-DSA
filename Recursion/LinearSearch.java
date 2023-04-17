import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 1, 18, 9};
        int target = 1;
        int index = 0;
        System.out.println(find(arr, target, index));
        System.out.println(findIndex(arr, target, index));
        index = arr.length-1;
        System.out.println(findRevIndex(arr, target, index));
        index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findIndexArr(arr, target, index,list));
    }

     static ArrayList<Integer> findIndexArr(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findIndexArr(arr, target, index+1, list);
    }

    static int findRevIndex(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index-1);
    }



    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index+1);
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
       return arr[index] == target || find(arr, target, index+1);
    }
}
