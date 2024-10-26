class Solution 
{
    public int maximumGap(int[] nums) 
    {
        Arrays.sort(nums);
        int diff=0;
        int n = nums.length;
        if(n<2)
        {
            return 0;
        }
        for(int i=0;i<n-1;i++)
        {
            if(nums[i+1]-nums[i] > diff)
            {
                diff=nums[i+1]-nums[i];
            }
        }
        return diff;
    }
}