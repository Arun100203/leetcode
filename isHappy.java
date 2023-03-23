class Solution {
    public boolean isHappy(int n) {
        Map<Integer, Integer> h = new HashMap<>();
        for(int i=n;i<=Integer.MAX_VALUE;)
        {
            
            String s = String.valueOf(i);
            int sum = 0;

            for(int j=0;j<s.length();j++)
                sum = sum + (s.charAt(j) - '0') * (s.charAt(j) - '0');
            
            if(h.containsKey(sum))
                return false;

            h.put(sum, h.getOrDefault(sum, 0)+1);

            if(sum == 1)
                return true;
            
            
            i = sum;
        }
        return false;
    }
}
