public class StringPalindrome {
    public static void main(String[] args) {
        String word = "abccda";
        int s = 0; // starting index = 0
        int e = word.length()-1; // ending index is 5
        System.out.println(palindrome(word, s, e));
    }

    static boolean palindrome(String word, int s, int e) {
        if (s>e) {
            return true;
        }
        if (word.charAt(s)!=word.charAt(e)){
            return false;
        }
        return palindrome(word, s+1,e-1);


    }
}
