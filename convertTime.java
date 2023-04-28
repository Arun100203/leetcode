class Solution {
    public int convertTime(String current, String correct) {
        int h = Integer.parseInt(current.substring(0,2));
        int m = Integer.parseInt(current.substring(3,5));
        int cur = (h*60) + m;
        System.out.println(cur);
        int h1 = Integer.parseInt(correct.substring(0,2));
        int m1 = Integer.parseInt(correct.substring(3,5));
        int cor = (h1*60) + m1;
        System.out.println(cor);
        return helper(cur, cor, 0);
    }
    int helper(int cur, int cor, int ans)
    {
        //System.out.println(cur+" "+cor);
        if(cur == cor)
            return ans;

        if(cur+60 <= cor)
            return helper(cur+60, cor, ans+1);

        if(cur+15 <= cor)
            return helper(cur+15, cor, ans+1);

        if(cur+5 <= cor)
            return helper(cur+5, cor, ans+1);

        if(cur+1 <= cor)
            return helper(cur+1, cor, ans+1);

        return 0;
    }
}
