class Solution 
{
    public int[][] construct2DArray(int[] original, int m, int n) 
    {
        int len=original.length;
        int[][] ans=new int[m][n];
        if(m*n != len)
        {
            return new int[0][0];
        }
        int c=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans[i][j]=original[c];
                c++;
            }
        }
        return ans;
    }
}