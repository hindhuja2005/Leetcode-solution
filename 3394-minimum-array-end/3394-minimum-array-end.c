long long minEnd(int n, int x) {
    long int res=x;
    for(int i=0;i<n-1;i++){
        res=(res+1)|x;
    }
    return res;
}