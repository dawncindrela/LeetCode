class Solution 
{
    public List<Boolean> prefixesDivBy5(int[] nums) 
    {
        List<Boolean> ans = new ArrayList<>();
        int n=nums.length;
        int a=0;
        for(int i=0;i<n;i++)
        {
            a=(a<<1) | nums[i];
            if(a%5 == 0)
            {
                ans.add(true);
            }
            else
            {
                ans.add(false);
            }
            a=a%5;
        }
        return ans;
    }
}