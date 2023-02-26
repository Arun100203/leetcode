class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1)
        return 1;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        System.out.print(hm);
        int ans = 0, one = 0;
        boolean first = true;
        if(hm.size()==1)
        return s.length();
        
        for(Map.Entry<Character, Integer> entry : hm.entrySet())
        {
            if(entry.getValue()%2==0)
            ans += entry.getValue();
            else if(entry.getValue() >1 && entry.getValue()%2!=0)
            {
                if(first)
                {
                    ans += entry.getValue();
                    first = false;
                }
                else
                ans += entry.getValue()-1;
            }
            else if(first && entry.getValue()==1 )
            {
                one = 1;
                first = false;
            }
        }
        return ans + one;
    }
}
