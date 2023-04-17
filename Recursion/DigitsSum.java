public class DigitsSum {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(digitsum(n));
    }

    static int digitsum(int n) {
        if (n==0) {
            return 0;
        }
        return n%10 + digitsum(n/10);
    }
}
