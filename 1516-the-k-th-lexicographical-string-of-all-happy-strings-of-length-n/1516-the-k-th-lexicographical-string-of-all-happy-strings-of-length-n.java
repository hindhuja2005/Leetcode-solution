class Solution {
    List <String> happystring=new ArrayList<>();
    public String getHappyString(int n, int k) {
        String currentstring="";
        generatehappyString(n,currentstring);
        if(happystring.size()<k){
            return "";
        }
        Collections.sort(happystring);
        return happystring.get(k-1);
    }
    public void generatehappyString(int n,String currentstring){
        if(currentstring.length()==n){
            happystring.add(currentstring);
            return;
        }
        for(char i='a';i<='c';i++){
            if(currentstring.length()>0 && currentstring.charAt(currentstring.length()-1)==i)
            continue;
            generatehappyString(n,currentstring+i);
        }
    }
}