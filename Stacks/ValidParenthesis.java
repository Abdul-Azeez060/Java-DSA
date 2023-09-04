import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "(([]){})";
        System.out.println(isValid(str));
    }

    private static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        // traverse over the entire string
        for (int i = 0; i < str.length(); i++) {
            // i the character
            char ch = str.charAt(i);

            // opening
            if (ch == '(' || ch == '[' || ch == '{' ) {
                s.push(ch);
            }

            //closing
            // if stack is empty
            else if (s.isEmpty()){
                return false;
            }
            // pair is correct
            else if ((s.peek() == '[' && ch == ']')
                    || (s.peek() == '(' && ch == ')')
                    || (s.peek() == '{' && ch == '}')){
                s.pop();
            }
            // pair is incorrect
            else {
                return false;
            }

        }
        if (s.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
}
