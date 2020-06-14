/********************
200. Number of Islands

Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. 
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
You may assume all four edges of the grid are all surrounded by water.

Example 1:
Input:
11110
11010
11000
00000
Output: 1

Example 2:
Input:
11000
11000
00100
00011
Output: 3
********************/
class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null)
            return 0;
        int count =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] != '0'){
                    recurIsland(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void recurIsland(char[][] grid,int x,int y){
        if(x<0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] != '1')
            return;
        
        grid[x][y] = '0';
        recurIsland(grid,x+1,y);
        recurIsland(grid,x-1,y);
        recurIsland(grid,x,y+1);
        recurIsland(grid,x,y-1);
    }
}