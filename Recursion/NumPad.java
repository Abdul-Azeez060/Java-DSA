import java.util.ArrayList;

public class NumPad {
    public static void main(String[] args) {
        String up = "29";
        numPad("", up);
        System.out.println(numPad("", up));
    }
    static ArrayList<String> numPad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list  = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for (int i = (digit-2)*3; i <(digit*3)-3 ; i++) {
            if (digit == 8 && i == 18 || digit == 9 && i == 21) {
                i++;
            }
            char ch = (char)('a'+i);
            list.addAll(numPad(p+ch, up.substring(1)));
            if (i == 17 || i == 20 ) {
                list.addAll(numPad(p+ (char)(ch+1),up.substring(1) ));
            }
            if (i == 22 || i == 23 && digit == 9 ) {
                list.addAll(numPad(p+ (char)(ch+2),up.substring(1) ));
            }


        }
        return list;
    }
}
