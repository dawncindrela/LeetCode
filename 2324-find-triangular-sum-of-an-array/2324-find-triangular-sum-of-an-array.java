class Solution 
{
    public int triangularSum(int[] nums) 
    {
        
        int len=nums.length;
        if(nums.length==1)
        {
            return nums[0];
        }
        while(len>1)
        {
            for(int j=0;j<len-1;j++)
            {
                nums[j]=(nums[j]+nums[j+1])%10;;
            }
            len--;
        }
        return nums[0];
    }
}