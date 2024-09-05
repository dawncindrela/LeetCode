class Solution 
{
    public int maximumWealth(int[][] accounts) 
    {
        int r=accounts.length;
        int c=accounts[0].length;
        int[] wealth = new int[r];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                wealth[i]+=accounts[i][j];
            }
        }
        int w = wealth.length;
        int max=wealth[0];
        for(int i=0;i<w;i++)
        {
            if(wealth[i]>max)
            {
                max=wealth[i];
            }
        }
        return max;
    }
}