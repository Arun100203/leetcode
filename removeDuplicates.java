class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<2) 
            return n;
        int size = 1;
        for(int i=1; i<n; i++)
        {
            if(nums[i]==nums[i-1]) 
                continue;
            nums[++size-1] = nums[i];
        }
        return size;
    }
}
