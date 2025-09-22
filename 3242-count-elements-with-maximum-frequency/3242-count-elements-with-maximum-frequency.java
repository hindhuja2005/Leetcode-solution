class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=-1;
        int maxele=-1;
        int res=0;
        for(int i:nums){
            if(i>maxele){
                maxele=i;
            }
        }
        int a[]=new int[maxele+1];
        for(int i:nums){
            a[i]++;
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int i:nums){
            if(a[i]==max){
                res+=a[i];
                a[i]=0;
            }
        }
        return res;
    }
}