class Solution {
    public int maximum69Number (int num) {
        /*ArrayList<Integer> n=new ArrayList<>();
        while(num>0){
            int rem=num%10;
            num=num/10;
            n.add(rem);
        }
        Collections.reverse(n);
        for(int i=0;i<n.size();i++){
            if(n.get(i)==6){
                n.set(i,9);
                break;
            }
        }
        int ans=0;
        for(int i=0;i<n.size();i++){
            ans+=n.get(i);
            if(i!=n.size()-1) ans*=10;
        }
        return ans;*/
        StringBuilder sb=new StringBuilder();
        sb.append(num);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='6'){
                sb.setCharAt(i,'9');
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}