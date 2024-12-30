class Solution 
{
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) 
    {
        int sum = 0;
        int n = nums.size();
        for(int i=0;i<n;i++)
        {
            if(Integer.bitCount(i)==k )
            {
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}