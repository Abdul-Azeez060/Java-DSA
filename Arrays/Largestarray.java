public class Largestarray {
    public static void main(String[] args) {
        int array[] = {1,233,443,223,671,432,43,786};
        System.out.println("largest value is "+getLargest(array));
    }

    public static int getLargest(int[] array){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("smallest number is "+ min);
        return max;
    }
}