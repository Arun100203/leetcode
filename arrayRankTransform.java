class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int ans[] = new int[arr.length];
        ans = arr.clone();
        Arrays.sort(arr);
        int res[] = Arrays.stream(arr)
                                    .distinct()
                                    .toArray();
        for(int i=1;i<=res.length;i++)
            hmap.put(res[i-1], i);
        
        System.out.println(Arrays.toString(ans));
        for(int i=0;i<ans.length;i++)
        {
            ans[i] = hmap.get(ans[i]);
        }

        return ans;
    }
}
