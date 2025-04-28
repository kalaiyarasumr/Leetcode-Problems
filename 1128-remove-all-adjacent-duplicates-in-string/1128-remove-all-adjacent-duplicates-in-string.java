import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>(); 
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == c) {
                st.pop(); 
            } else {
                st.push(c); 
            }
        }
        StringBuilder rs = new StringBuilder();
        for (char c : st) {
            rs.append(c);
        }

        return rs.toString(); 
    }
}
