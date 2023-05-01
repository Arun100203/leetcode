class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;
        for(int i:nums)
            max = Math.max(max, i);
        int ans = 0;
        while(k-->0)
        {
            ans += (max++);
        }
        return ans;
    }
}
