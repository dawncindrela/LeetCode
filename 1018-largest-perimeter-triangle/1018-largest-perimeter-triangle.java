class Solution 
{
    public int largestPerimeter(int[] nums) 
    {
        Arrays.sort(nums);
        int n=nums.length;
        int p=0;
        for(int i=n-1;i>1;i--)
        {
            int a=nums[i];
            int b=nums[i-1];
            int c=nums[i-2];
            p=(a+b+c);
            if(b+c>a)
            {
                return p;
            }
        }
        return 0;
    }
}