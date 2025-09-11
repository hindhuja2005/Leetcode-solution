class Solution {
    public String sortVowels(String s) {
        List<Character> l=new ArrayList<>();
        for(char i:s.toCharArray()){
            if(i=='A' ||i=='E' ||i=='I' ||i=='O' ||i=='U' ||i=='a' ||i=='e' ||i=='i' ||i=='o' ||i=='u' ){
                l.add(i);
            }
        }
        Collections.sort(l);
        StringBuilder s1=new StringBuilder();
        int j=0;
        for(char i:s.toCharArray()){
            if(i=='A' ||i=='E' ||i=='I' ||i=='O' ||i=='U' ||i=='a' ||i=='e' ||i=='i' ||i=='o' ||i=='u' ){
                s1.append(l.get(j++));
            }
            else{
                s1.append(i);
            }
        }
        return s1.toString();
    }
}