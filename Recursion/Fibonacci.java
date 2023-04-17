public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i <=7; i++) {
            System.out.println(i + " " +fibo2(i));
        }
       System.out.println(fibo(n));
      //  System.out.println(fiboNumber(n));
    }

    static int fibo(int n) {
        // base condition
        if (n<2) {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    static double fiboNumber(int n ){
        return (double)((Math.pow((1+Math.sqrt(5))/2, n))-(Math.pow((1-Math.sqrt(5))/2, n))/Math.sqrt(5));
    }
    static double fibo2(int n ){
        return (double)((1/Math.sqrt(5))*(Math.pow(((1+Math.sqrt(5))/2), n)));
    }
}
