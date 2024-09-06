class Solution 
{
    public int numberOfPairs(int[] nums1, int[] nums2, int k) 
    {
        int n = nums1.length;
        int m = nums2.length;
        int c=0;
        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=m-1;j++)
            {
                if(nums2[j]*k != 0 && nums1[i]%(nums2[j]*k)==0)
                {
                    c++;
                }
            }
        }
        return c;
    }
}