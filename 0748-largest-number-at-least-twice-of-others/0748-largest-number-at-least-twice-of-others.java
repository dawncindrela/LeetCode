class Solution 
{
    public int dominantIndex(int[] nums) 
    {
        int n=nums.length;
        int max=nums[0];
        int c=0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                c=i;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(i!=c && max<2*nums[i])
            {
                return -1;
            }
        }
        return c;
    }
}