class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i:nums)
        hm.put(i, hm.getOrDefault(i, 0)+1);

        int n = nums.length/2;
        
        
        List<Map.Entry<Integer, Integer> > list = new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());        
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()
        {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
            {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<k;i++)
            li.add(list.get(i).getKey());
        System.out.println(li);
        System.out.println(list);
        int res[] = new int[li.size()];
        for(int i = 0; i < li.size(); i++) res[i] = li.get(i);
        return res;
    }
}
