class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        if(n%2 == 0 && m%2==0)
        return 0;
        if(n%2 == 0 && m%2 != 0)
        {
            int ans = 0;
            for(int i:nums1)
            ans ^= i;
            return ans;
        }
        else if(n%2 != 0 && m%2 == 0)
        {
            int ans = 0;
            for(int i:nums2)
            ans ^= i;
            return ans;
        }
        else
        {
            int ans = 0;
            for(int i:nums1)
            ans ^= i;
            for(int i:nums2)
            ans ^= i;
            return ans;
        }
    }
}
