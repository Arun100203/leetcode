class Solution {
    public int orangesRotting(int[][] grid) {
       int max = -1;
        int visi[][] = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 2)
                dfs(i, j, visi, grid, 0);
            }
        }

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1 && visi[i][j]==0) 
                return -1;
                    max = Math.max(visi[i][j], max);
            }
        }
        return max;
    }
    void dfs(int r, int c, int visi[][], int grid[][], int min)
    {
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c] == 0)
        return;
        if(min!=0 && grid[r][c]==2)
        return;
        if(visi[r][c]!=0 && visi[r][c]<=min)
        return;

        visi[r][c] = min;

        dfs(r, c+1, visi, grid, min+1);
        dfs(r+1, c, visi, grid, min+1) ;
        dfs(r-1, c, visi, grid, min+1) ;
        dfs(r, c-1, visi, grid, min+1);
    }
}
