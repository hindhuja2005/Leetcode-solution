class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int c=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                c++;
            }
            else{
                if(c==k){
                    return true;
                }
                else{
                    c=1;
                }
            }
        }
        if(c==k){
            return true;
        }
        else{
            return false;
        }
    }
}