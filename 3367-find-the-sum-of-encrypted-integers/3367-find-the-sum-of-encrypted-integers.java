class Solution 
{
    public int sumOfEncryptedInt(int[] nums) 
    {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int max=0,x=0,k=1;
            int num=nums[i];
            while(num>0)
            {
                int d=num%10;
                max=Math.max(d,max);
                num/=10;
            }
            while(nums[i]>0)
            {
                x+=max*k;
                k*=10;
                nums[i]/=10;
            }
            sum+=x;
        }
        return sum;
    }
}