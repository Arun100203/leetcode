class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int digit = 0;
        for(int i:nums)
        {
            String s = String.valueOf(i);
            int t = s.length();
            if(t == 1)
            digit += i;
            else
            {
                for(char c:s.toCharArray())
                {
                    digit += Character.getNumericValue(c);
                }
            }
        }
        return Math.abs(sum - digit);
    }
}
