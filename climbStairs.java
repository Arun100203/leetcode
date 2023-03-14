class Solution {
    public int climbStairs(int n) {
        if(n<=3)
            return n;
        int r=0,s=1,t=1;
        for(int i=0;i<n;i++)
        {
            t=r+s;
            r=s;
            s=t;
        }
        return s;
    }
}
