class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        permutations(nums, 0);
        //System.out.println(set);
        for(List<Integer> l : set)
        ans.add(l);
        return ans;
    }
    void permutations(int nums[], int l)
    {
        if(l==nums.length-1)
        {
            List<Integer> li = new ArrayList<>();
            for(int i:nums)
            li.add(i);
            set.add(li);
        }
        for(int i=l;i<nums.length;i++)
        {
            swap(nums, l, i);
            permutations(nums, l+1);
            swap(nums, l, i);
        }
    }
    void swap(int nums[], int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
