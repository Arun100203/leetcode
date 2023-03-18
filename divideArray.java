class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        
        for(Map.Entry<Integer, Integer> entry: hm.entrySet())
            if(entry.getValue() % 2 != 0)
                return false;

        return true;
    }
}
