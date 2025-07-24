class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> s1 = new Stack<>();
        int res=0;
        for(char i:s.toCharArray()){
            if((i==')') && ((!s1.isEmpty())&&( s1.peek()=='('))){
                s1.pop();
                res--;
            }
            else{
                res++;
                s1.push(i);
            }
        }
        return res;
    }
}