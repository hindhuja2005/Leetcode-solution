class Solution {
    public char kthCharacter(int k) {
        String word="a";
        while(word.length()<k){
            StringBuilder next = new StringBuilder();
            for (char c : word.toCharArray()) {
                next.append(c == 'z' ? 'a' : (char)(c + 1));
            }
            word += next.toString();
        }
        return word.charAt(k-1);
    }
}