class Solution 
{
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) 
    {
        int n = nums.length;
        int[] ans = new int[]{-1,-1};
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(Math.abs(i-j)>=indexDifference && Math.abs(nums[i]-nums[j])>=valueDifference)
                {
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
}