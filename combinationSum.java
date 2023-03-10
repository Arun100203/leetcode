class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, candidates, new ArrayList<>(), 0, target);
        return ans;
    }
    void backtrack(List<List<Integer>> ans, int arr[], List<Integer> li, int start, int target)
    {
        if(target < 0)
        return;
        if(target == 0)
        ans.add(new ArrayList<>(li));
        else
        {
            for(int i=start;i<arr.length;i++)
            {
                li.add(arr[i]);
                backtrack(ans, arr, li, i, target - arr[i]);
                li.remove(li.size() - 1);
            }
        }
    }
}
