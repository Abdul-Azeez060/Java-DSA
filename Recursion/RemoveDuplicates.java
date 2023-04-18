public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abdulazeez";
        System.out.println(rmDuplicates(str, 0, new StringBuilder(), new boolean[26]));
    }

 static StringBuilder rmDuplicates(String str, int i, StringBuilder newStr, boolean[] map) {
        if (i == str.length()) {
            return newStr;
        }
        char curr = str.charAt(i);
        if (map[curr - 'a']) {
            return rmDuplicates(str, i+1, newStr, map);
        }
        else {
            map[curr - 'a'] = true;
            return rmDuplicates(str, i+1, newStr.append(curr), map);
        }

    }
}
