class Solution 
{
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) 
    {
        int n=arr1.length;
        int m=arr2.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(Math.abs(arr1[i]-arr2[j]) <= d)
                {
                    c++;
                    break;
                }
            }
        }
        return (n-c);
    }
}