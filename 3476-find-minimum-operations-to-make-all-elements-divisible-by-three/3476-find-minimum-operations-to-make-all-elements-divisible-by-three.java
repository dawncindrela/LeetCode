class Solution 
{
    public int minimumOperations(int[] nums) 
    {
        int op = 0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if((nums[i]+1)%3==0)
            {
                nums[i]+=1;
                op++;
            }
            else if((nums[i]-1)%3==0)
            {
                nums[i]-=1;
                op++;
            }
            if(nums[i]%3==0)
            {
                continue;
            }
        }
        return op;
    }
}