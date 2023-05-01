class Solution {
    public int findJudge(int n, int[][] trust) {
        if (trust.length == 0 && n == 1) 
            return 1;
        int in[] = new int[n+1];
        
        int[] indeg = new int[n + 1];
        for (int[] temp : trust) {
            indeg[temp[0]]--;
            indeg[temp[1]]++;
        }

        for (int i = 0; i < indeg.length; i++) {
            if (indeg[i] == n - 1) return i;
        }
        return -1;
    }
}
