class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            int st=s.indexOf(part);
            s=s.substring(0,st)+s.substring(st+part.length());
        }
        return s;
    }
}