class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            String s1="";
            for(int i=0;i<s.length()-1;i++){
                s1=s1+(s.charAt(i)-'0'+s.charAt(i+1))%10;
            }
            s=s1;
        }
        if(s.charAt(0)==s.charAt(1)){
            return true;
        }
        else{
            return false;
        }
    }
}