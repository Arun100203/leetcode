class Solution {
    public String digitSum(String s, int k) {
        if(s.length()<=k)
        return s;

        String res = "";
        int i;
        for(i=0;i<s.length();i+=k)
        {
            //System.out.println(res);
            if(i+k<s.length())
                res+=Sum(s.substring(i,i+k));
            else
                res+=Sum(s.substring(i));
        }
        

        return digitSum(res, k);
    }
    public String Sum(String st) {
    	
    	int a,b;
    	int sum = 0;
    	
    	for(int i=0;i<st.length();i++) {
    		sum+=Character.getNumericValue(st.charAt(i));
    	}
    	return String.valueOf(sum);
    }
}
