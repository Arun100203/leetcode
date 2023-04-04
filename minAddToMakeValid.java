class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> sta = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == ')') {
                if (sta.isEmpty() || sta.pop() != '(') {
                    ++count;
                }
            } else {
                sta.push(s.charAt(i));
            }
        }
        return count + sta.size();
    }
}
