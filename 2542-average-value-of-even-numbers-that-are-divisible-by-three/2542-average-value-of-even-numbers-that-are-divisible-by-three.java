class Solution 
{
    public int averageValue(int[] nums) 
    {
        int n=nums.length;
        int sum=0;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]%6==0)
            {
                sum+=nums[i];
                c++;
            }
        }
        if(c!=0)
        {
            int avg=sum/c;
            return avg;
        }
        else
        {
            return 0;
        }
    }
}