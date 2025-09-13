class Solution {
    public int maxFreqSum(String s) {
        int a[]=new int[26];
        int maxv=0;
        int maxc=0;
        char a1[]=s.toCharArray();
        for(char i:a1){
            a[i-'a']++;
        }
        for(char i:a1){
            if(a[i-'a']!=0){
                if(i=='a'||i=='e'||i=='o'||i=='u'||i=='i'){
                    maxv=Math.max(maxv,a[i-'a']);
                    a[i-'a']=0;
                }
                else{
                    maxc=Math.max(maxc,a[i-'a']);
                    a[i-'a']=0;
                }
            }
        }
        return maxv+maxc;
    }
}