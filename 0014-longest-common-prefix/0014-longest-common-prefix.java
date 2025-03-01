class Solution {
    public String longestCommonPrefix(String[] strs) {
        int l=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            l=Math.min(l,strs[i].length());
        }
        String res="";
        for(int i=0;i<l;i++){
            int f=0;
            for(int j=0;j<strs.length-1;j++){
                if(strs[j].charAt(i)!=strs[j+1].charAt(i)){
                    f=1;
                    break;
                }
            }
            if(f==0){
                res=res+strs[0].charAt(i);
            }
            else{
                break;
            }
        }
        return res;
    }
}