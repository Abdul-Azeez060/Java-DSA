public class UpperCase {
    public static void main(String[] args) {
        String word = "hi, my name is abdul azeez";
        String ans = toUpperCase(word);
        System.out.println(ans);

    }

     static String toUpperCase(String word) {
        StringBuilder sb = new StringBuilder();
        char ch  = Character.toUpperCase(word.charAt(0));
        sb.append(ch);
        for (int i = 1; i < word.length() ; i++) {
            if (word.charAt(i)==' ' && i<word.length()-1) {
                sb.append(word.charAt(i));
                i++;
                sb.append(Character.toUpperCase(word.charAt(i)));
            }else {
                sb.append(word.charAt(i));
            }
        }

        return sb.toString();
    }

}
