class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int res = 0;
        for(int i=0;i<nums.length;i++)
        {
             int hcf = 1;
            for(int j=i;j<nums.length;j++)
            {
                hcf = lcm(hcf, nums[j]);
                if(hcf == k) res++;
                else if(hcf > k) break;
            }
        }
        
        return res;
    }
    int lcm(int a, int b)
    {
        return (a*b)/gcd(a, b);
    }
    int gcd(int a, int b)
    {
        if(b==0) return a;
        return gcd(b , a%b);
    }
}



