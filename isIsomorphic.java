class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
        return false;
        Map<Character, Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char s_index = s.charAt(i);
            char t_index = t.charAt(i);
            if(map.containsKey(s_index))
            {
                if(!map.get(s_index).equals(t_index))
                return false;
                
            }
            else
            {
                if(!map.containsValue(t_index))
                map.put(s_index, t_index);
                else
                return false;
            }
            //System.out.println(map);
        }
        
        return true;
    }
}
