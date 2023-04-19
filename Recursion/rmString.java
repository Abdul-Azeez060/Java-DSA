public class rmString {
    public static void main(String[] args) {
        String str = "bccapplesd";
        skipString(str, new StringBuilder());
    }
    public static void skipString(String str, StringBuilder newStr) {
        if (str.isEmpty()) {
            System.out.println(newStr);
            return;
        }
        if (str.startsWith("apple")) {
            skipString(str.substring(5),newStr );
        }
        else {
            skipString(str.substring(1), newStr.append(str.charAt(0)));
        }
    }
}
