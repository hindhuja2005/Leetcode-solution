class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j=0;
        Stack<Integer> s=new Stack<>();
        for(int i:pushed){
            s.push(i);
            while(!s.isEmpty() && s.peek()==popped[j]){
                s.pop();
                j++;
            }
        }
        return s.isEmpty();
    }
}