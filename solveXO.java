class Solution {
    public void solve(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if((i==0 || j==0 || i==grid.length-1 || j==grid[0].length-1) && grid[i][j] == 'O')
                dfs(i, j, grid);
                
            }
        }
        //System.out.println(Arrays.deepToString(visi));
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 'O' )
                grid[i][j] = 'X';
                else if(grid[i][j] == 'E')
                grid[i][j] = 'O';
            }
        }
    }
    void dfs(int r, int c, char grid[][])
        {
            if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]=='E' || grid[r][c] == 'X')
            return;
            grid[r][c]='E';
            dfs(r-1, c, grid);
            dfs(r, c+1, grid);
            dfs(r+1, c, grid);
            dfs(r, c-1, grid);
        }
}
