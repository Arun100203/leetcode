class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int res = -2147483648,currentValue = 0;
        for(int i: nums)
        {
            currentValue = Math.max(currentValue + i, i);
            res = Math.max(currentValue , res);
            //System.out.println(currentValue +" "+res);
        }
        return res;
    }
}
