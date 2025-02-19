class Solution {
    public int lengthOfLongestSubstring(String s) {
        int c=1;
        int max=1;
        if(s.length()==0){
            return 0;
        }
        StringBuffer s1=new StringBuffer("");
        s1.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            while(s1.toString().contains(""+s.charAt(i))){
                s1.deleteCharAt(0);
            }
            s1.append(s.charAt(i));
            max=Math.max(max,s1.length());
        }
        max=Math.max(max,s1.length());
        return max;
    }
}