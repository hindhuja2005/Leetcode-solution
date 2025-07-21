class Solution {
    public String makeFancyString(String s) {
        StringBuilder s1=new StringBuilder();
        boolean flag=false;
        char prev='0';
        for(char a:s.toCharArray()){
            if(a!=prev){
                s1.append(a);
                flag=false;
            }
            else if(a==prev && !flag){
                s1.append(a);
                flag=true;
            }
            prev=a;
        }
        return s1.toString();
    }
}