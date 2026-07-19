class Solution 
{
    public int findGCD(int[] nums) 
    {
        Arrays.sort(nums);
        int n=nums.length;
        int small=nums[0];
        int large=nums[n-1];
        int i=1;
        int gcd=1;
        while(i<=small)
        {
            if(small%i==0 && large%i==0)
            {
                gcd=i;
            }
            i++;
        }
        return gcd;
    }
}