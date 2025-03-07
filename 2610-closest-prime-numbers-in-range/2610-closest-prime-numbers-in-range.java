class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList <Integer> l=new ArrayList<>();
         boolean[] isPrime = new boolean[right + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;  // 0 and 1 are not primes
        
        for (int i = 2; i * i <= right; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = left; i <= right; i++) {
            if (isPrime[i]) {
                l.add(i);
            }
        }
        int a[]={-1,-1};
        System.out.println(l.toString());
        int min=Integer.MAX_VALUE;
        for(int i=0;i<l.size()-1;i++){
            System.out.println(l.get(i));
            if((l.get(i+1)-l.get(i))<min){
                min=l.get(i+1)-l.get(i);
                a[0]=l.get(i);
                a[1]=l.get(i+1);
            }
        }
        return a;
    }
}