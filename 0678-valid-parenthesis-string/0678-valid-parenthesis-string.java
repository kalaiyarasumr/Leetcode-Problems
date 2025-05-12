class Solution {
    public boolean checkValidString(String s) {
        Stack<Character> stack = new Stack<>(); 
        int n = s.length();

        int openCount = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '*') {
                openCount++;
            } else {
                openCount--;
            }
            if (openCount < 0) {
                return false;
            }
        }

        int closeCount = 0;
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ')' || ch == '*') {
                closeCount++;
            } else {
                closeCount--;
            }
            if (closeCount < 0) {
                return false;
            }
        }

        return true;

    }

}