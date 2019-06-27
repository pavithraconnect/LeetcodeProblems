class Solution {
    public boolean isPowerOfTwo(int n) {
        long x =1;
        while(x<n){
            x=x*2;
        }
        return x==n;
    }
}
