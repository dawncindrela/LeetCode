class Solution 
{
    public int threeSumClosest(int[] nums, int target) 
    {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    int diff=Math.abs(target-(nums[i]+nums[j]+nums[k]));
                    min=Math.min(diff,min);
                    if(diff<=min)
                    {
                        sum=nums[i]+nums[j]+nums[k];
                    }
                }
            }
        }
        return sum;
    }
}