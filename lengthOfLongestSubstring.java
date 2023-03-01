class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
    int  max=0;
    HashSet<Character> h= new HashSet();
    while(right<s.length())
    {
        if(!h.contains(s.charAt(right)))
        {
            h.add(s.charAt(right));
            right++;
            max=Math.max(h.size(),max);
                
        }
        else 
        {
            h.remove(s.charAt(left));
            left++;
        }
    }
    return max;
}
}
