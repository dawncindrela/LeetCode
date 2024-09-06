class Solution 
{
    public double minimumAverage(int[] nums) 
    {
        Arrays.sort(nums);
        int n=nums.length;
        double[] avg = new double[n/2 ] ;
        int f=0,r=n-1;
        double min=nums[n-1];
        for(int i=0;i<n/2;i++)
        {
            avg[i]=(double)(nums[f]+nums[r])/2;
            f++;
            r--;
            min=Math.min(avg[i],min);
        }
        return min;
    }
}