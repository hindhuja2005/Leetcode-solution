class Solution {
    public int maxDifference(String s) {
        int a[]=new int[26];
        for(int i=0;i<s.length();i++){
            int j=s.charAt(i)-'a';
            a[j]++;
        }
        int e=Integer.MAX_VALUE;
        int o=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            int j=s.charAt(i)-'a';
            if(a[j]!=0){
                if(a[j]%2==0){
                    e=Math.min(e,a[j]);
                }
                else{
                    o=Math.max(o,a[j]);
                }
                a[j]=0;
            }
        }
        return o-e;
    }
}