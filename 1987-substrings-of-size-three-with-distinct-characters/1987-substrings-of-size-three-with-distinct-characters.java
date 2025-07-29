class Solution {
    public int countGoodSubstrings(String s) {
        int[] seen = new int[256];
        Arrays.fill(seen, -1);
        int i = 0, j = 1, c = 0;

        if (s.length() < 3) return 0;

        seen[s.charAt(0)] = 0;

        while (i <= s.length() - 3) {
            if (j < s.length() && seen[s.charAt(j)] < i) {
                seen[s.charAt(j)] = j;
                if ((j - i) == 2) {
                    c++;
                    i++;
                    j = i + 1;
                    Arrays.fill(seen, -1); // reset seen for the new window
                    seen[s.charAt(i)] = i;
                } else {
                    j++;
                }
            } else {
                i = seen[s.charAt(j)] + 1;
                j = i + 1;
                Arrays.fill(seen, -1);
                if (i < s.length())
                    seen[s.charAt(i)] = i;
            }
        }

        return c;
    }
}