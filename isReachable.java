class Solution {
    public boolean isReachable(int x, int y) {
        while(x%2 != 1)
        x = x/2;
        while(y%2 != 1)
        y = y/2;
        if(gcd(x, y) == 1)
        return true;

        return false;
    }
    int gcd(int a, int b)
    {
        if(b==0) return a;
        return gcd(b , a%b);
    }
}
