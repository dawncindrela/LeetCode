class Solution 
{
    public boolean canSortArray(int[] nums) 
    {
        int n = nums.length;
        int[] ans = new int[n];
        System.arraycopy(nums, 0, ans, 0, n); 
        Arrays.sort(ans); 
        boolean swapped = true;
        while (swapped) 
        {
            swapped = false;
            for (int i = 0; i < n - 1; i++) 
            {
                if (nums[i] > nums[i + 1] && Integer.bitCount(nums[i]) == Integer.bitCount(nums[i + 1])) 
                {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    swapped = true; 
                }
            }
        }
        return Arrays.equals(nums, ans); 
    }
}
