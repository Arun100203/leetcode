class Solution {
    public int longestValidParentheses(String s) {
        int max = 0;
        Stack<Integer> sta = new Stack<Integer>();
        sta.push(-1);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
            sta.push(i);
            else
            {
                sta.pop();
                if(sta.isEmpty())
                sta.push(i);
                else
                max = Math.max(max, i - sta.peek());
            }
        }
        return max;
    }
}
