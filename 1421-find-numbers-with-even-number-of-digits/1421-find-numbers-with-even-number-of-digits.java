class Solution 
{
    public int findNumbers(int[] nums) 
    {
        int n = nums.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            int even =0;
            while(nums[i]>0)
            {
               even++;
               nums[i]/=10; 
            }
            if(even%2==0)
            {
                c++;
            }
        }
        return c;
    }
}