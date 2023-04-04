class Solution {
    public String toLowerCase(String s) {
        String str = "";
        for(char c:s.toCharArray())
        {
            int n = c-0;
            //System.out.println(n);
            if(n >=65  && n <= 90)
            str += (char)(n + 32);
            else
            str += c;
            
        }
        return str;
    }
}
