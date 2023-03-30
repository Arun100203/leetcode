class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(hmap.containsKey(c))
            return c;
            else
            hmap.put(c, 1);
        }
        return ' ';
    }
}
