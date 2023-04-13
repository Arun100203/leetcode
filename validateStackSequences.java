class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();
        int j = 0;
        for(int i:pushed)
        {
            s.push(i);
            while(!s.isEmpty() && j<pushed.length && s.peek() == popped[j])
            {
                s.pop();
                j++;
            }
        }
        return j == pushed.length;
    }
}
