public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(rev(n));
        System.out.println(palindrome(n));
    }

     static boolean palindrome(int n) {
        return false;
    }

    static int rev(int n) {
        int digits = (int)(Math.log10(n))+1; // explicit conversion or type casting
        return helper(n, digits) ;
    }

     static int helper(int n, int digits) {
        if (n == 0) {
            return 0;
        }
        return (int)((n%10)*Math.pow(10, digits-1)) + helper(n/10, digits-1);

    }
}
