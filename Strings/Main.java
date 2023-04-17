import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // every object is converted to string by toString method
      // println() contains  valueOf method which calls toString method
        System.out.println(12);
        System.out.println(Arrays.toString(new int[]{2, 4, 5, 6}));
        System.out.println('a'+1);
        // byte short char boolean is promoted to int in an expression
        System.out.println('a'-'b');

        System.out.println("a"+"b");
        // in strings it is concatenated
        System.out.println("a"+1);
        // here it calls toString method which converts 1 to string
        // "a"+"1" looks like this after few steps
        System.out.println("a"+'b');


        String word = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            word+=ch;
        }
        System.out.println(word);
        // the time complexity is O(n^2) that is a ab abc abcd abcde.....
        // 1 2 3 4 .....n
        // here it takes so much of memory as a, ab, abc, abcd , .... all these objects are created in the memory and occupy some space until garbage collection hits


        System.out.println("abdul"+new ArrayList<>());
        // here the object is converted to string by toString method

        System.out.println(new Integer(54)+""+new ArrayList<>());
        // here + is applied only if there exists at least one string in the complex objects

        // this is going to give error
        //System.out.println(new Integer(3)+new ArrayList<>());
     }
}