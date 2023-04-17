// Amazon question
// Time complexity is O(n) as it increments even in while loop
public class StringCompression {
    public static void main(String[] args) {
        String word = "aaabc";
        System.out.println(compress(word));
    }

     static String compress(String word) {
        StringBuilder sb = new StringBuilder();
         for (int index = 0; index < word.length(); index++) {
             int count = 1;
             char ch = word.charAt(index);
             while ( index<word.length()-1 && word.charAt(index)==word.charAt(index+1)){
                 count++;
                 index++;
             }
             sb.append(ch);
             if (count>1){
                 sb.append(count);
             }
         }return sb.toString();
    }
}
