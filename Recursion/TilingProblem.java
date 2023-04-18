public class TilingProblem {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(noOfWays(n));
    }

    public static int noOfWays(int n) {
        // base
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical
        int fnm1 = noOfWays(n - 1);
        // horizontal
        int fnm2 = noOfWays(n - 2);
        return fnm1 + fnm2;
    }
}
