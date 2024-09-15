class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        int n= nums.length;
        int f=0;
        int r=n-1;
        if(target<nums[f])
        {
            return 0;
        }
        if(target>nums[r])
        {
            return n;
        }
        while(f<r)
        {
            int mid=f+(r-f)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            if(target<nums[mid])
            {
                r=mid;
            }
            else 
            {
                f=mid+1;
            }
        }
        return f;
    }
}