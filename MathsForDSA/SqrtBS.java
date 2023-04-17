public class SqrtBS {
    public static void main(String[] args) {
        int n = 36;
        int p = 3;
        System.out.println(sqrt(5, 3));
    }

     static double sqrt(int n, int p) {
         double root = 0.0;
         int s = 1;
         int e = n;
         int m = 0;
         while (s <= e) {
             m = s + (e - s) / 2;
             if (m * m == n) {
                 return m;
             } else if (m * m > n) {
                 e = m - 1;
             } else {
                 s = m + 1;
             }
         }
         root = m;
         // precision
         double incr = 0.1;
         for (int i = 0; i < p; i++) {
             while (root*root<=n) {
                 root += incr;
             }
             root-=incr;
             incr/=10;
         }


         return root;
     }
}
