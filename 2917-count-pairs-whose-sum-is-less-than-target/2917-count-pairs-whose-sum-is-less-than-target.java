class Solution 
{
    public int countPairs(List<Integer> nums, int target) 
    {
        int n = nums.size();
        Integer[] num=nums.toArray(new Integer[0]);
        int c=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(num[i] + num[j] < target)
                {
                    c++;
                }
            }
        }
        return c;
    }
}