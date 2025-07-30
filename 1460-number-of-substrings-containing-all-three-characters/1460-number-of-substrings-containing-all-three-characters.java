class Solution {
    public int numberOfSubstrings(String s) {
        int n[]=new int[3];
        int c=0,left=0;
        for(int i=0;i<s.length();i++){
            n[s.charAt(i)-'a']++;
            while(n[0]>=1 && n[1]>=1 && n[2]>=1){
                c=c+(s.length()-i);
                n[s.charAt(left++)-'a']--;
            }
        }
        return c;
    }
}