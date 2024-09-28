class Solution 
{
    public int findNonMinOrMax(int[] nums) 
    {
        int n = nums.length;
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[n-1];
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=a && nums[i]!=b)
            {
                return nums[i];
            }
        }
        return -1;
    }
}