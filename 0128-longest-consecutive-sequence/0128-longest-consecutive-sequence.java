class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        int n = nums.length;
        if(n==0)
        {
            return 0;
        }
        int c=1;
        int max=1;
        Arrays.sort(nums);
        for(int i=1;i<n;i++)
        {
            if(nums[i] == nums[i-1])
            {
                continue;
            }
            else if (nums[i]==nums[i-1]+1)
            {
                c++;
            }
            else 
            {
                max=Math.max(c,max);
                c=1;
            }
        }
        return Math.max(max,c);
    }
}