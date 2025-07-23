class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            return removePatterns(s, 'a', 'b', x, y);
        } else {
            return removePatterns(s, 'b', 'a', y, x);
        }
    }

    private int removePatterns(String s, char first, char second, int firstScore, int secondScore) {
        char[] temp = new char[s.length()];
        int top = -1;
        int score = 0;

        // First pass: remove high-value pattern (e.g., "ab" or "ba")
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (top >= 0 && temp[top] == first && c == second) {
                top--;
                score += firstScore;
            } else {
                temp[++top] = c;
            }
        }

        // Second pass: remove the other pattern (e.g., "ba" if first was "ab")
        char[] remaining = new char[top + 1];
        for (int i = 0; i <= top; i++) {
            remaining[i] = temp[i];
        }

        top = -1;
        for (int i = 0; i < remaining.length; i++) {
            char c = remaining[i];
            if (top >= 0 && temp[top] == second && c == first) {
                top--;
                score += secondScore;
            } else {
                temp[++top] = c;
            }
        }

        return score;
    }
}
