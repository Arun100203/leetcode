class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i:nums)
        hm.put(i, hm.getOrDefault(i, 0)+1);

        List<Integer> li = new ArrayList<>();
        int n = nums.length/3;
        for(Map.Entry<Integer, Integer> entry: hm.entrySet())
        if(entry.getValue()>n)
        li.add(entry.getKey());
        return li;
    }
}
