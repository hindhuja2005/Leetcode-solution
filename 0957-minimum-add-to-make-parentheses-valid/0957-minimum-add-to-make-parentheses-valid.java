class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0, insertions = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++; // need one more ')' to match
            } else {
                if (open > 0) {
                    open--; // matched with a previous '('
                } else {
                    insertions++; // need one '(' before this ')'
                }
            }
        }
        return insertions + open; 
    }
}