class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String res = s1 + " " + s2;
        String arr[] = res.split(" ");
        Map<String, Integer> hmap = new HashMap<>();
        for(String s:arr)
        hmap.put(s, hmap.getOrDefault(s, 0) + 1);

        
        List<String> li = new ArrayList<>();
        for(Map.Entry<String, Integer> e : hmap.entrySet())
        {
            if(e.getValue() == 1)
            li.add(e.getKey());
        }
        System.out.println(li);
        int in = 0;
        String ans[] = new String[li.size()];
        for(String st : li)
        ans[in++] = st;
        return ans;
    }
}
