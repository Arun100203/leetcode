class Solution {
    public boolean isGoodArray(int[] nums) {
        int hcf = 0;
        for(int i:nums)
        {
            hcf = gcd(hcf, i);
            if(hcf == 1)
            return true;
        }
        //System.out.println(gcd(5, 10));
        return false;
    }
    int gcd(int a, int b)
    {
        if(a==0) return b;
        if(b==0) return a;
        if(a%b == 0) return b;

        return gcd(b, a%b);
    }
}
