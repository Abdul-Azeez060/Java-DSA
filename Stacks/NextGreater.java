// TC is O(n) as in worst case we are pushing n elements O(n) and removing n elements O(n) so O(2n)
import java.util.Arrays;
import java.util.Stack;
public class NextGreater {
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] nextGreater = new int[arr.length];
        getNextGreater(arr, nextGreater);
        System.out.println(Arrays.toString(nextGreater));
    }

    private static void getNextGreater(int[] arr, int[] nextGreater) {
        Stack<Integer> s = new Stack<>();
        // removing all the smaller elements right next to current element
        for (int i = arr.length-1; i >= 0 ; i--) {
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]){
                s.pop();
            }
            // if it is empty means  is no other element is greater than current element
            if (s.isEmpty()){
                nextGreater[i] = -1;
            }
            // else the top index of stack is greater than current element
            else {
                nextGreater[i] = arr[s.peek()];
            }
            // pushing the current index
            s.push(i);

        }

    }
}
