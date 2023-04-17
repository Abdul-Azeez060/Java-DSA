public class Patterns {
    public static void main(String[] args) {
        //characterPrint(6);
       //floydsTriangle(6);
      //pattern6(88);
      //pattern8(66);
      //pattern10(67);
     // pattern13(5);
      //  pattern5(5);
       // pattern28(5); wrong
        //pattern31(5);
        //Trial.pattern33(5);
       // Trial.pattern17(4);
       // Trial.pattern18(4);
       // Trial.pattern32(6);
        Trial.pattern34(5);


    }
    static void pattern31(int n) {
        for (int row = 0; row < 2*n-1; row++) {
            for (int col = 0; col < 2 * n - 1; col++) {
                int valueOfIndex = n - Math.min(Math.min(row, col), Math.min(2*(n-1)-row, 2*(n-1)-col));
                System.out.print(valueOfIndex+" ");
            }
            System.out.println();
        }
    }


     static void pattern28(int n) {
         for (int i = 0; i <n; i++) {
             // spaces
             for (int space = 0; space < n-i+1; space++) {
                 System.out.print(" ");
             }
             for (int j = 0; j < i+1; j++) {
                 System.out.print("* ");
             }System.out.println();
         }for (int i = n-1; i>0; i--) {
             // spaces
             for (int space = 0; space < n-i+1; space++) {
                 System.out.print(" ");
             }
             for (int j = 0; j <i; j++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
    }

    static void pattern13(int n ){
        for (int i = 1; i <=n; i++) {
            // spaces
            for (int space = 1; space <=n-i; space++) {
                System.out.print(" ");
            }
            // first part
            for (int j = 1; j <=i ; j++) {
                if (j==1 || i==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            // second part
            for (int k = 2; k <=i ; k++) {
                if (k==i || i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
     static void pattern10(int n) {
        // 10, 11, 12
         for (int i = 1; i<=n; i++) {
             for (int j = 1; j <=n-i; j++) {
                 System.out.print(" ");
             }
             for (int j = 1; j <=i ; j++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
    }

    static void pattern8(int n) {
        // just change the outer loop for inversion by x axis
         for (int i = 1; i<=n ; i++) {
             // spaces
             for (int space = 1; space <=n-i; space++) {
                 System.out.print(" ");
             } // stars
             for (int j = 1; j <=i; j++) {
                 System.out.print("*");
             } // second part of stars
             for (int j = 1; j <i; j++) {
                 System.out.print("*");
             }System.out.println();
         }
    }
    static void pattern5(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }System.out.println();
        }for (int i = n-1; i>0; i--) {
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     static void pattern6(int n) {
         for (int i = 1; i <=n; i++) {
             // spaces
             for (int j = 1; j <=n-i ; j++) {
                 System.out.print(" ");

             }for (int j = 1; j <=i; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
    }
     static void pattern3(int n ) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("*");
            } System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }System.out.println();
        }
    }
    static void characterPrint(int n){
        char ch = 'A';
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(ch);
                ch =  (char)(ch+1);
            }System.out.println();
        }
    }
    static void floydsTriangle(int n){
        int count =1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
