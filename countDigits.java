class Solution {
    public int countDigits(int num) {
        if(num<10) return 1;
        int temp = num;
        String s = String.valueOf(temp);
        int t = s.length()-1;
        int ans = 0;
        //System.out.println(temp);
        while(t >= 0)
        {
            if(temp % (s.charAt(t)- '0') == 0)
            ans++;
            //System.out.println(temp % (s.charAt(t)- '0'));
            --t;
        }
        return ans;
    }
}
