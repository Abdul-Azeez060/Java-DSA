import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String str = "abc";
        subSeq(str, "");
        ArrayList<String> list = new ArrayList<>();
        subSeq(str, "",list );
        System.out.println(list);
        System.out.println(subSeqRet(str, ""));
        ArrayList<String> list2 = new ArrayList<>();
        subseqAscii(str, "", list2);
        System.out.println(list2);
        System.out.println(subSeqAsciiRet(str, ""));

    }

     static void  subseqAscii(String up, String p, ArrayList<String> list) {
        if (up.isEmpty()) {
            list.add(p);
            return;
        }
        char ch = up.charAt(0);
        ArrayList<String> first;
        ArrayList<String> second;
        ArrayList<String> third;
        subseqAscii(up.substring(1),p+ch, list);
        subseqAscii(up.substring(1), p, list);
        subseqAscii(up.substring(1), p+(ch+0), list);

    }
    static ArrayList<String> subSeqAsciiRet(String up, String p) {
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> list1; // declaration
        ArrayList<String> list2;
        ArrayList<String> list3;

        list1 = subSeqRet(up.substring(1), p+ch); // initilization
        list2 = subSeqRet(up.substring(1), p);
        list3 = subSeqRet(up.substring(1), p+(ch+0));
        list1.addAll(list2);
        list1.addAll(list3);
        return list1;
    }


    static ArrayList<String> subSeqRet(String up, String p) {
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
             list.add(p);
             return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> list1; // declaration
        ArrayList<String> list2;

        list1 = subSeqRet(up.substring(1), p+ch); // initilization
        list2 = subSeqRet(up.substring(1), p);
        list1.addAll(list2);
        return list1;
    }

    public static void subSeq(String up, String p) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(up.substring(1), p+ch);
        subSeq(up.substring(1), p);
    }
    public static void subSeq(String up, String p, ArrayList<String> list) {
        if (up.isEmpty()) {
            if (!p.equals(" ")) {
                list.add(p);
                return;
            }
        }

        char ch = up.charAt(0);
        subSeq(up.substring(1), p+ch, list);
        subSeq(up.substring(1), p, list);
    }
}
