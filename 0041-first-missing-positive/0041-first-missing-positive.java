class Solution 
{
    public int firstMissingPositive(int[] nums) 
    {
        Arrays.sort(nums);
        int small=1;
        for(int n : nums)
        {
            if(n==small)
            {
                small++;
            }
            else if(n>small)
            {
                return small;
            }
        } 
        return small;   
    }
}