import java.util.*;
class Solution {
    public String capitalizeTitle(String title) {
        String arr[] = title.split(" ");
        String res = "";
        for(String s:arr)
        {
            s = toLowerCase(s);
            if(s.length() > 2)
            {
                s = capitalize(s);
            }
            res += s + " ";
        }
        return res.trim();
    }
    String capitalize(String s)
    {
        char c = s.charAt(0);
        return Character.toTitleCase(c) + s.substring(1, s.length());
    }
    public String toLowerCase(String s) {
        String str = "";
        for(char c:s.toCharArray())
        {
            int n = c-0;
            if(n >=65  && n <= 90)
            str += (char)(n + 32);
            else
            str += c;
        }
        return str;
    }
}
