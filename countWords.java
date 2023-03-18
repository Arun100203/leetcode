class Solution {
    public int countWords(String[] words1, String[] words2) {
       
        
        Map<String, Integer> hmap1 = new HashMap<>();
        Map<String, Integer> hmap2 = new HashMap<>();
        for(String s:words1)
        hmap1.put(s, hmap1.getOrDefault(s, 0) + 1);
        for(String s:words2)
        hmap2.put(s, hmap2.getOrDefault(s, 0) + 1);

        int count = 0;
        if(hmap1.size() < hmap2.size())
        {
            for(Map.Entry<String, Integer> entry : hmap1.entrySet())
            {
                if(hmap2.containsKey(entry.getKey()) && hmap2.get(entry.getKey()) == entry.getValue() && entry.getValue() == 1)
                count++;
            }
        }
        else
        {
            for(Map.Entry<String, Integer> entry : hmap2.entrySet())
            {
                if(hmap1.containsKey(entry.getKey()) && hmap1.get(entry.getKey()) == entry.getValue() && entry.getValue() == 1)
                count++;
            }
        }
        return count;
    }
}
