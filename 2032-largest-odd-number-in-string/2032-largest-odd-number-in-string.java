class Solution {
    public String largestOddNumber(String num) {
        StringBuffer s=new StringBuffer();
        boolean f=false;
        for(int i=num.length()-1;i>=0;i--){
            /*if((num.charAt(i)-'0')%2==0){
                if(f){
                    s.append(num.charAt(i));
                }
            }
            else{
                s.append(num.charAt(i));
                f=true;
            }*/
            if((num.charAt(i)-'0')%2!=0){
                return num.substring(0,i+1);
            }
        }
        //return s.reverse().toString();
        return "";
    }
}