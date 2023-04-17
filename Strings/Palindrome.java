public class Palindrome {
    public static void main(String[] args) {
        String word = "abdul";
        if (isPalindrome(word)) {
            System.out.printf("%s is palindrome", word);
        } else {
            System.out.printf("%s is not palindrome", word);
        }
    }
    static boolean isPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if(word.charAt(start)!=word.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
   /* static boolean ifPalindrome(String word){
        for (int i = 0; i < word.length()/2; i++) {
            int start = i;
            int end = n-1-i;
            if(word.charAt(start)!=word.charAt(end)){
                return false;
            }
        }return true;
    }*/

}
