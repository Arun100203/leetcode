class Solution {
    Map<Character, Integer> h = new HashMap<>();
    public int countConsistentStrings(String allowed, String[] words) {
        
        int ans = 0;

        for(char c: allowed.toCharArray())
            h.put(c, h.getOrDefault(c, 0) + 1);

        for(String word : words)
            if(find(word))
                ans++;

        return ans;
    }
    boolean find(String s)
    {
        for(char c:s.toCharArray())
            if(!h.containsKey(c))
                return false;

        return true;
    }
}
