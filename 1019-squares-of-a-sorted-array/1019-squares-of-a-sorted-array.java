class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        int n=nums.length;
        int[] num=new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=(int)Math.pow(nums[i],2);
        }
        Arrays.sort(num);
        return num;
    }
}