class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            return remove(s, "ab", x, y);
        } else {
            return remove(s, "ba", y, x);
        }
    }

    private int remove(String s, String pattern1, int score1, int score2) {
        Stack<Character> stack = new Stack<>();
        int res = 0;
        char first = pattern1.charAt(0), second = pattern1.charAt(1);

        // First pass: remove high-value pattern
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == first && c == second) {
                stack.pop();
                res += score1;
            } else {
                stack.push(c);
            }
        }

        // Rebuild the remaining string after first pattern removal
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        String remaining = sb.reverse().toString();

        // Second pass: remove the other pattern
        stack.clear();
        char altFirst = second, altSecond = first;
        for (char c : remaining.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == altFirst && c == altSecond) {
                stack.pop();
                res += score2;
            } else {
                stack.push(c);
            }
        }

        return res;
    }
}
