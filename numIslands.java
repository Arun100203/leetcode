class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
        boolean visi[][] = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(dfs(i, j, visi, grid) >= 1)
                ans++;
            }
        }
        return ans;
    }
    int dfs(int r, int c, boolean visi[][], char grid[][])
        {
            if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || visi[r][c] || grid[r][c] == '0')
            return 0;
            visi[r][c] = true;
            return (1 + dfs(r, c+1, visi, grid) 
                        + dfs(r+1, c, visi, grid)
                         + dfs(r-1, c, visi, grid)
                          + dfs(r, c-1, visi, grid));
        }
}
