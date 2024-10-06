class Solution 
{
    public int[] getSneakyNumbers(int[] nums) 
    {
        int n=nums.length;
        int[] a=new int[2];
        int c=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    a[c]=nums[i];
                    c++;
                    break;
                }
            }
        }
        return a;
    }
}