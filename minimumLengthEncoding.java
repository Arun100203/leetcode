class Solution {
    public int minimumLengthEncoding(String[] words) {
        Set<String> set = new HashSet(Arrays.asList(words));
        for(String s : words)
        {
            for(int i=1;i<s.length();i++)
            set.remove(s.substring(i));
        }
        int ans = 0;
        //System.out.println(set);
        for(String s:set)
        ans += s.length() + 1;
        return ans;
    }
}
