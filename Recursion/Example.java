public class Example {
    public static void main(String[] args) {
        // print 1 2 3 4 5 without calling the print function 5 times or writing sout 5 times in print()
        print1(1);
    }
    static void print1(int n ){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n ){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n ){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n ){
        System.out.println(n);
        print5(5);
    }
    static void print5(int n ){
        System.out.println(n);
    }

}
