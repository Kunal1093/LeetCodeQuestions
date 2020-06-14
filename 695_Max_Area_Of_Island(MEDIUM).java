/********************
695. Max Area of Island

Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) 
You may assume all four edges of the grid are surrounded by water.
Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)

Example 1:
[[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.

Example 2:
[[0,0,0,0,0,0,0,0]]
Given the above grid, return 0.
********************/

class Solution {
    public static int maxArea;
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null)
            return 0;
        maxArea = 0;
        int x = grid.length;
        int y = grid[0].length;
        boolean visited[][] = new boolean[x][y];
        for(int i=0;i<x;i++)
            for(int j=0;j<y;j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    int val = findAreaRecursively(grid,visited,i,j);
                    maxArea = Math.max(maxArea,val);
                }
            }
        return maxArea;
    }
    
    public int findAreaRecursively(int[][] grid, boolean visited[][],int i,int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || visited[i][j]){
            return 0;
        }
        
        visited[i][j] = true;
        return 1 + findAreaRecursively(grid,visited,i+1,j)+findAreaRecursively(grid,visited,i-1,j)+findAreaRecursively(grid,visited,i,j+1)+findAreaRecursively(grid,visited,i,j-1);
        
    }
}