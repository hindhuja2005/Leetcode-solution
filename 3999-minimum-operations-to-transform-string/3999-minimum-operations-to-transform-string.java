class Solution {
    public int minOperations(String s) {
        if(s.length()==1 && s.equals("a")){
            return 0;
        }
        char a='z';
        for(char i:s.toCharArray()){
            if(i=='a'){
                continue;
            }
            else{
                if(i-'z'<a-'z'){
                    a=i;
                    System.out.println(a);
                }
            }
        }
        return 'z'-a+1;
    }
}