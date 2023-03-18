class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int i:nums)
        hmap.put(i, hmap.getOrDefault(i, 0) + 1);
        //System.out.println(hmap);
        int count = 0, remain = 0;
        for(Map.Entry<Integer, Integer> entry: hmap.entrySet())
        {
            if(entry.getValue()%2 == 0)
            count += entry.getValue()/2;
            else if(entry.getValue()%2 != 0 && entry.getValue()>1)
            {
                count += (entry.getValue() - 1)/2;
                remain++;
            }
            else
            remain++;

        }
        return new int[]{count, remain};
    }
}
