class Solution {
    public int countGoodSubstrings(String s) {
        int[] seen = new int[256];
        Arrays.fill(seen, -1);

        int n = s.length();
        int count = 0;

        int i = 0; // window start
        for (int j = 0; j < n; j++) {
            // If character repeated inside window, shrink from left
            if (seen[s.charAt(j)] >= i) {
                i = seen[s.charAt(j)] + 1;
            }

            seen[s.charAt(j)] = j;

            // When window size is 3 and all chars are distinct
            if (j - i + 1 == 3) {
                count++;
                i++; // Slide window forward by 1 to look for next candidate
            }
        }

        return count;
    }
}
