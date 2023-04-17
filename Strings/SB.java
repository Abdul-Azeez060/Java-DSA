public class SB {
    public static void main(String[] args) {
        // String builder is a class just like String but stringbuiler is mutable
        StringBuilder sb = new StringBuilder();
        //System.out.println(sb);
        for (int i = 0; i < 26; i++) {
                char ch = (char)('a'+i);
                sb.append(ch);
        }

        System.out.println(sb);
        sb.deleteCharAt(5);

        System.out.println(sb.indexOf("v"));
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("rgugghe");
        System.out.println(sb2);
        System.out.println(sb.compareTo(sb2)); // compareTo ??

        sb.insert(2,0); // offset is index and i is the value you are inserting
        System.out.println(sb);

        System.out.println(sb.toString());

        System.out.println(sb.length());


        String name = "abdul";
        System.out.println(name.indexOf('u'));

    }
}
