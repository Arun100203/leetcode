class Solution {
    public List<String> topKFrequent(String[] words, int k) {
         HashMap<String, Integer> hm = new HashMap<>();
        for(String i:words)
        hm.put(i, hm.getOrDefault(i, 0)+1);
        
        
        List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());        
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
            {
                if(o2.getValue().compareTo(o1.getValue()) == 0)
                    return o1.getKey().compareTo(o2.getKey());
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        List<String> li = new ArrayList<>();
        for(int i=0;i<k;i++)
            li.add(list.get(i).getKey());
        System.out.println(li);
        System.out.println(list);
        
        return li;
    }
}
