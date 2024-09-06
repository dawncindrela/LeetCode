class Solution 
{
    public int[] finalPrices(int[] prices) 
    {
        int n =prices.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(j>i && prices[j] <= prices[i])
                {
                    ans[i]=prices[i]-prices[j];
                    break;
                }
                else 
                {
                    ans[i]=prices[i];
                }
            }
        }
        return ans;
    }
}