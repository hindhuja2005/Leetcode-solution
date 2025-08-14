class Solution {
    public String largestGoodInteger(String num) {
        int maxi=-1;
        String ans="";
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                if(num.charAt(i)-'0'>maxi){
                    ans=""+num.charAt(i)+num.charAt(i+1)+num.charAt(i+2);
                    maxi=num.charAt(i)-'0';
                }
            }
        }
        return ans;
    }
}