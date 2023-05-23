import java.util.ArrayList;

public class LetterCombinationsofaPhone {
    public static void main(String[] args) {
        String up = "18";
        pad("", up);
        System.out.println(padRet("", up).size());
    }

     static ArrayList<String> padRet(String p, String up) {
         if (up.isEmpty()) {
             ArrayList<String> list = new ArrayList<>();
             list.add(p);
             return list;
         }
         int digit = up.charAt(0) - '0';
         ArrayList<String> list  = new ArrayList<>();
         for (int i = (digit-1)*3; i < digit*3; i++) {
             if (i == 26) {
                 break;
             }
             char ch = (char)('a'+i);
             list.addAll(padRet(p+ch, up.substring(1)));
         }
         return list;

    }

    static void pad(String p, String up) {
         if (up.isEmpty()) {
             System.out.println(p);
             return;
    }
         int digit = up.charAt(0) - '0';
         for (int i = (digit-1)*3; i < digit*3; i++) {
             if (i == 26) {
                 break;
             }
             char ch = (char)('a'+i);
             pad(p+ch, up.substring(1));
         }

         }
}
