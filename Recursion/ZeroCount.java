public class ZeroCount {
    public static void main(String[] args) {
        int n = 102003;
        System.out.println(zeroCount(n));
    }

    private static int zeroCount(int n) {
        int c = 0;
        return helper(n, c);
    }

    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n%10;
        if (rem == 0) {
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}
