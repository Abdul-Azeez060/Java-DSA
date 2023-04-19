public class rmChar {
    public static void main(String[] args) {
        String str = "bcaccad";
        skip(str, new StringBuilder());
        System.out.println(skip2(str));
    }

     static void skip(String str, StringBuilder newStr) { // taking StringBuilder in argument
        if (str.isEmpty()) {
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(0);
        if (ch == 'a') {
            skip(str.substring(1),newStr );
        }
        else {
            skip(str.substring(1), newStr.append(ch));
        }
    }
    static String skip2(String str) { // taking string in body
        if (str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);
        if (ch == 'a'){
            return skip2(str.substring(1));
        }
        return ch+skip2(str.substring(1));
    }
}
