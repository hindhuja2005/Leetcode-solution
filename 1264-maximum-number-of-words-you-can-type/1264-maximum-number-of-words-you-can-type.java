class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> b=new HashSet<>();
        for(char i:brokenLetters.toCharArray()){
            b.add(i);
        }
        int res=0;
        for(String s:text.split(" ")){
            boolean f=true;
            for(char i:s.toCharArray()){
                if(b.contains(i)){
                    f=false;
                    break;
                }
            }
            if(f){
                res++;
            }
        }
        return res;
    }
}