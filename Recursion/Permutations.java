public class Permutations {
    public static void main(String[] args) {
        String up = "abc";
        permutations("", up);
    }

    public static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        for (int i = 0; i < up.length(); i++) {
            char ch = up.charAt(i);
            String NewStr = up.substring(0, i) + up.substring(i+1);
            permutations(p+ch,NewStr);

        }
    }
}
