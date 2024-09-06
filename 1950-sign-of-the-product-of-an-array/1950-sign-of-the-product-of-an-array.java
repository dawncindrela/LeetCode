class Solution 
{
    public int arraySign(int[] nums) 
    {
        int n=nums.length;
        int sign =1;
        for(int i:nums)
        {
            if(i==0)
            {
                return 0;
            }
            if(i<0)
            {
                sign= -sign;
            }
        }
        return sign;
    }
}