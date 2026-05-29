class Solution 
{
    public int minElement(int[] nums) 
    {
        int n = nums.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++)
        {
            int sum=0;
            while(nums[i]>0)
            {
                sum+= nums[i]%10;
                nums[i]/=10;
            }
            res[i]=sum;
        }
        Arrays.sort(res);
        return res[0];
    }
}