import java.util.Stack;

class Solution {
    public boolean isValid(String S) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            switch (ch) {
                case '{':
                    s.push(ch);
                    break;
                case '[':
                    s.push(ch);
                    break;
                case '(':
                    s.push(ch);
                    break;
                case '}':
                    if (s.empty() || s.peek() != '{') {
                        return false;
                    }
                    s.pop();
                    break;
                case ']':
                    if (s.empty() || s.peek() != '[') {
                        return false;
                    }
                    s.pop();

                    break;
                case ')':
                    if (s.empty() || s.peek() != '(') {
                        return false;
                    }
                    s.pop();

                    break;
            }
        }
        return s.empty();
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        String paranthesis = "{[][](){}[][][][[]][]}";
        System.out.printf("%s %s\n", paranthesis, s1.isValid(paranthesis));
    }
}
