class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> h = new TreeMap<>();
        for(char c: s.toCharArray())
        h.put(c, h.getOrDefault(c, 0) + 1);

        
        List<Map.Entry<Character, Integer> > list =
               new LinkedList<Map.Entry<Character, Integer> >(h.entrySet());
 
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        String res = "";
        for(Map.Entry<Character, Integer> entry: list)
        {
            int t = entry.getValue();
            while(t-- > 0)
                res += entry.getKey();
        }
        System.out.println(h);
        return res;
    }
}
