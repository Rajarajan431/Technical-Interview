import java.util.Stack;

public class ValidParentheses {

    public static boolean isValidAnagram(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else {
               if (!st.empty() && 
                    ((st.peek() == '(' && s.charAt(i) == ')') ||
                     (st.peek() == '{' && s.charAt(i) == '}') ||
                     (st.peek() == '[' && s.charAt(i) == ']'))) {
                    st.pop(); 
                }
                else {
                  
                    // Unmatched closing bracket
                    return false; 
                }
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        String s = "()[]{}";

        System.out.println(isValidAnagram(s));
    }
}
