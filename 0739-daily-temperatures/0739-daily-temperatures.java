class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int a[]=new int[n];
        /*for(int i=0;i<n-1;i++){
            int c=1;
            boolean f=false;
            for(int j=i+1;j<n;j++){
                if(temperatures[j]<=temperatures[i]){
                    c++;
                }
                else{
                    a[i]=c;
                    f=true;
                    break;
                }
            }
            if(!f)
            a[i]=0;
        }
        a[n-1]=0;
        return a;*/
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                a[s.peek()]=i-s.peek();
                s.pop();
            }
            s.push(i);
        }
        return a;
    }
}