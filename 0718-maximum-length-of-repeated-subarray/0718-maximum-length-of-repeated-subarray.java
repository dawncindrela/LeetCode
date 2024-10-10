class Solution 
{
    public int findLength(int[] nums1, int[] nums2) 
    {
        int max=0;
        int n1=nums1.length;
        int n2=nums2.length;
        int[][] arr=new int[n1+1][n2+1];
        for(int i=1;i<=n1;i++)
        {
            for(int j=1;j<=n2;j++)
            {
                if(nums1[i-1]==nums2[j-1])
                {
                    arr[i][j]=1+arr[i-1][j-1];
                    max=Math.max(arr[i][j],max);
                }
            }
        }
        return max;
    }
}