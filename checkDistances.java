class Solution {
    public boolean checkDistances(String s, int[] distance) {
        
        return helper(s.charAt(0), s, 0, distance);
    }
    boolean helper(char c, String s, int i, int[] distance)
    {
        if(i >= s.length()-1)
        return true;

        int start = s.indexOf(c);
        int end = s.lastIndexOf(c);
        if(distance[c-'a'] != (end - start - 1))
        return false;
        
        return helper(s.charAt(++i), s, i, distance);

    }
}
