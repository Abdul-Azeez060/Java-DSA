import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Abdul Azeez";
        name.toLowerCase();
        System.out.println(name);
        // string is immutable

        char[] ch =  name.toCharArray();
        System.out.println(Arrays.toString(ch));

        String[] arr =  name.split(" ");
        System.out.println(Arrays.toString(arr));

        System.out.println("   abdul   ".strip());

        System.out.println(ch);

        String name1 = name.replace(" ", "[]");

        System.out.println(name.substring(0,5)); // slicing in python

        // lexicographic comparision
        System.out.println(name.compareTo(name1));  // a and A treated as different
        System.out.println(name.compareToIgnoreCase(name1)); // A and a both are treated as same

        System.out.println(name.toUpperCase());
        System.out.println(Character.toUpperCase('a'));
        name = "a";
        System.out.println(name.toUpperCase());

        char letter = 'a'; // touppercase method does not change the original letter same as string
        System.out.println(  Character.toUpperCase(letter));
        System.out.println(letter);

        name.intern();

    }
}
