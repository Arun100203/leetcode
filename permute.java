class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        permutations(nums, 0);
        return ans;
    }
      void permutations(int[] nums, int l)
    {
        if(l==nums.length-1)
        {
            List<Integer> perm = new ArrayList<>();
            for (int num : nums) {
                perm.add(num);
            }
            ans.add(perm);
        }
        for (int i = l; i < nums.length; i++) {
            swap(nums, l, i);
            permutations(nums, l + 1);
            swap(nums, l, i);
        }
    }
    void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

