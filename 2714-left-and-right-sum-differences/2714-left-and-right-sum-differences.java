class Solution 
{
    public int[] leftRightDifference(int[] nums) 
    {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++)
        {
            int leftSum=0,rightSum=0;
            for(int j=0;j<i;j++)
            {
                leftSum+=nums[j];
            }
            for(int k=i+1;k<n;k++)
            {
                rightSum+=nums[k];
            }
            ans[i]=Math.abs(leftSum-rightSum);
        }
        return ans;
    }
}