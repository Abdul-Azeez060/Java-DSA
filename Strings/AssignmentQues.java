import java.util.Arrays;

public class AssignmentQues {
    public static void main(String[] args) {
        String str ="knee";
        System.out.println(getLowerCaseCount(str));
        String str2 = "keen";
        if(isanagrams(str, str2)){
            System.out.printf("%s and %s are anagrams ", str2,str);
        }else {
            System.out.println("not anagrams");
        }
        System.out.println(isanagrams2(str, str2));
        // read about intern() in string and StringBuffer


    }

    static boolean isanagrams2(String str, String str2) {
        char[] str1 = str.toCharArray();
        char[] str3 = str2.toCharArray();
        Arrays.sort(str1); // arrays are mutable
        Arrays.sort(str3);
        if (str1.length!=str3.length){
            return false;
        }
        for (int i = 0; i < str1.length; i++) {
            if (str1[i]!=str3[i]){
                return false;
            }
        }
        return true;

    }

    static boolean isanagrams(String str, String str2) {
        if (str.length()!=str2.length()){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str2.indexOf(ch)==-1  ){
                return false;
            }
        }return true;
    }

    static int getLowerCaseCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=' ' && str.charAt(i)==Character.toLowerCase(str.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
