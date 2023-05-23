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
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = up.substring(0, i);
            String second = up.substring(i);
            permutations(first + ch + second, up.substring(1));

        }
    }
}
