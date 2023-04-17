public class Problem {
    public static void main(String[] args) {
        int[] indices = {4,5,6,7,0,1,2,3};
        String s = "codeleet";
        System.out.println(answer(s, indices));
    }
    public  static String answer(String s, int[] indices) {
        String ans ="";
        for(int i=0;i<indices.length;i++){
            char ch = (char)(s.charAt(indices[i]));
            ans+=ch;
        }
        return ans;
    }
}
