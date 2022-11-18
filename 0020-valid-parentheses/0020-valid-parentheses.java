class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray(); // String을 Char Array 타입으로(for 문으로 돌기 편하게)
        Stack<Character> stack = new Stack<>(); // '(' || '[' || '{'이 들어왔을 때 push할 스택
        for (char element : chars) {
            if (element == '(' || element == '[' || element == '{') {
                stack.push(element);
                continue;
            } else if (stack.empty()) {
                // ')' || ']' || '}' 이 들어왔을 때
                return false;
            }
            char top = stack.pop();
            if (top == '(' && element != ')') {
                return false;
            } else if (top == '[' && element != ']') {
                return false;
            } else if (top == '{' && element != '}') {
                return false;
            }
        }
        return stack.empty();
    }
}