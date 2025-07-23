class Solution {
    public char kthCharacter(long k, int[] operations) {
        /*String s="a";
        for(int i:operations){
            if(i==0){
                s=s+s;
            }
            else if(i==1){
                int l=s.length();
                int j=0;
                while(j<l){
                    if(s.charAt(j)=='z')
                    s+='a';
                    else
                    s+=(char)(s.charAt(j++)+1);
                }
                //System.out.println(s);
            }
        }
        return s.charAt((int)(k-1));*/
        int c = 0; k--;
        for (int i = 0; k != 0; i++, k >>= 1) c += ((int)(k & 1) & operations[i]);
        return (char)((c % 26) + 'a');
    }
}