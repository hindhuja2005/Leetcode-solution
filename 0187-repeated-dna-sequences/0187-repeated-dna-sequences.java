class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set seen=new HashSet();
        Set res=new HashSet();
        for(int i=0;i<s.length()-9;i++){
            String s1=s.substring(i,i+10);
            if(!seen.add(s1)){
                res.add(s1);
            }
        }
        return new ArrayList(res);
    }
}