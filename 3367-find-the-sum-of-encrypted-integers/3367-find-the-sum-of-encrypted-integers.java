class Solution 
{
    public int sumOfEncryptedInt(int[] nums) 
    {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int max=0;
            int c=0;
            int x=0;
            int num=nums[i];
            while(num>0)
            {
                int d=num%10;
                c++;
                max=Math.max(d,max);
                num/=10;
            }
            int k=1;
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