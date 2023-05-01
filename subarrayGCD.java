class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int hcf = 0, c = 0;
        for(int i=0;i<nums.length;i++)
        {
            hcf = 0;
            for(int j=i;j<nums.length;j++)
            {
                hcf = gcd(hcf, nums[j]);
                if(hcf == k)
                ++c;
            }
        }
        return c;
    }
    int gcd(int a, int b)
    {
        if(a==0) return b;
        if(b==0) return a;
        if(a%b == 0) return b;

        return gcd(b, a%b);
    }
}
