class Solution {
    public String countAndSay(int n) {
        String   str ="1";
        for(int i=1;i<n;i++)
            str = Find_Word(str);
          
        
         return str;
    }
    static String Find_Word(String s)
    {
        String res = "";
        
        char curr = s.charAt(0);
        
        System.out.println(s.length()); 
        int count = 1;
        for(int i=1;i<s.length();i++)
        {
            if(curr == s.charAt(i))
            count++;
            else
            {
                res+= String.valueOf(count);
                res+= String.valueOf(curr);
                curr = s.charAt(i);
                count = 1;
            }
        }
         res += String.valueOf(count);
         res += String.valueOf(curr);
        return res;
    }
}
