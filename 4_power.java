class Solution {
    public boolean isPowerOfFour(int n) {
        // n must be positive, a power of two, and (n - 1) divisible by 3
        if (n>0&&(n&(n-1))==0&&(n%3==1)) {
            return true;
        }
        return false;
    }
}
