class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> li = generateSubsets(nums);
        int sum = 0;
        for(int i=0;i<li.size();i++)
        {
            int ans = 0;
            for(int j:li.get(i))
            ans ^= j;

            sum += ans;
        }
        return sum;
    }
    public static List<List<Integer>> generateSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        int n = nums.length;
        int numSubsets = 1 << n;
        for(int i=0;i<numSubsets;i++)
        {
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if((i & (1 << j)) != 0)
                temp.add(nums[j]);
            }
            subsets.add(temp);
        }
        return subsets;
    }

}
