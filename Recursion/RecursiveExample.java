public class RecursiveExample {
    public static void main(String[] args) {
        // print 1 2 3 4 5 without calling the print function 5 times or writing sout 5 times in print()
        print(1);
    }
    static void print(int n ){
        if (n==5) { // base condition
            System.out.println(n);
            return; // return takes the flow of program to the function called place and nothing is executed after return;
        }
        System.out.println(n);
        print(n+1);
    }

}
