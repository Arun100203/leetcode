class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li = new ArrayList<>();
        gP(n, n, "", li);
        return li;
    }
    public static void gP(int left, int right, String current, List<String> li)
    {
        if(left==0 && right==0)
        {
            li.add(current);
            return;
        }
        
        if(left>0)
        gP(left-1, right, current + '(', li);
        if(right>left)
        gP(left, right-1, current + ')', li);
       
    }
}
