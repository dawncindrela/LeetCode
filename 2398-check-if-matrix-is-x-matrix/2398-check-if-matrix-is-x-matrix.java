class Solution 
{
    public boolean checkXMatrix(int[][] grid) 
    {
        int n = grid.length;
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                // Check if element is on the main diagonal or anti-diagonal
                if (i == j || i + j == n - 1) 
                {
                    // Diagonal elements should be non-zero
                    if (grid[i][j] == 0) 
                    {
                        return false;
                    }
                } 
                else 
                {
                    // Non-diagonal elements should be zero
                    if (grid[i][j] != 0) 
                    {
                        return false;
                    }
                }
            }
        }
        return true; // Return true if all conditions are satisfied
    }
}
