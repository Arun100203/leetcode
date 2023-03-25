class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i:nums)
        hm.put(i, hm.getOrDefault(i, 0)+1);

        int n = nums.length/2;
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        for(Map.Entry<Integer, Integer> entry: hm.entrySet())
            if(entry.getKey()%2==0)
                hm2.put(entry.getKey(), entry.getValue());

        if(hm2.size()==0)
        return -1;
        List<Map.Entry<Integer, Integer> > list = new LinkedList<Map.Entry<Integer, Integer> >(hm2.entrySet());        
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()
        {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
            {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        System.out.println(list.get(0).getKey());
        int val = list.get(0).getValue();
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getValue()==val)
            min = Math.min(min, list.get(i).getKey());
            else
            return min;
        }
        return min;
    }
}
