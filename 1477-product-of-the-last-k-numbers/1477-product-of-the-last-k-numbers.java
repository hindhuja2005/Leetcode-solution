class ProductOfNumbers {
    int p=1;
    ArrayList <Integer> l=new ArrayList<>();
    public ProductOfNumbers() {
    }
    
    public void add(int num) {
        if(num==0){
            l= new ArrayList<>();
            p=1;
            return;
        }
        p=p*num;
        l.add(p);
    }
    
    public int getProduct(int k) {
        if(l.size()<k) return 0;
        int ans=l.get(l.size()-1);
        if(l.size()==k) return ans;
        return ans/l.get(l.size()-1-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */