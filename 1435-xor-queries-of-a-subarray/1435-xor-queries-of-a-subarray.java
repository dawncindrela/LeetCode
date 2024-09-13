class Solution 
{
    public int[] xorQueries(int[] arr, int[][] queries) 
    {
        int a=queries.length;
        int[] ans = new int[a];
        for(int i=0;i<a;i++)
        {
            int left=queries[i][0];
            int right=queries[i][1];
            int x=0;
            for(int j=left;j<=right;j++)
            {
                x^=arr[j];
            }
            ans[i]=x;
        }
        return ans;
    }
}