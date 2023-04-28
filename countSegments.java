class Solution {
    public int countSegments(String s) {
        if(s.equals(""))
        return 0;
        
        return helper(s, 0, 0);
    }
    int helper(String s, int seg, int i)
    {
        if(i >= s.length())
        return seg;
        if((i==0 || s.charAt(i-1) == ' ' )&& s.charAt(i) != ' ')
        return helper(s, ++seg, ++i);

        return helper(s, seg, ++i);
    }
}
