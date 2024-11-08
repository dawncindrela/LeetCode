class Solution 
{
    public int[] getMaximumXor(int[] nums, int maximumBit) 
    {
        int n = nums.length;
        int k = (1 << maximumBit) - 1; 
        int[] ans = new int[n];
        int xorTotal = 0;
        for (int num : nums) 
        {
            xorTotal ^= num;
        }
        for (int i = 0; i < n; i++) 
        {
            ans[i] = xorTotal ^ k;  
            xorTotal ^= nums[n - 1 - i]; 
        }
        return ans;
    }
}
