class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> li = new ArrayList<>();
        for(int i=left;i<=right;i++)
        if(countDigits(i)) li.add(i);
        return li;
    }
    public boolean countDigits(int num) {
        if(num<10) return true;
        int temp = num;
        String s = String.valueOf(temp);
        int t = s.length()-1;
        int ans = 0;
        while(t >= 0)
        {
            if((s.charAt(t)- '0') != 0 && temp % (s.charAt(t)- '0') == 0)
            {
                --t;
                continue;
            }
            else
            return false;
            
        }
        return true;
    }
}
