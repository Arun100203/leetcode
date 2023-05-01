class Solution {
    public int maxPower(String s) {
        int longest = 1, current = 1;
        
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i) == s.charAt(i+1))
            current += 1;
            else
            current = 1;

            longest = Math.max(longest, current);
        }
        return Math.max(longest, current);
    }
}
