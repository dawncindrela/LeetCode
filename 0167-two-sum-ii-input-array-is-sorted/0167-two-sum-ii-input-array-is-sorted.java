class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int n= numbers.length;
        int f=0;
        int l=n-1;
        while(f<l)
        {
            int sum=numbers[f]+numbers[l];
            if(sum==target)
            {
                return new int[]{f+1,l+1};
            }
            else if(sum>target)
            {
                l--;
            }
            else
            {
                f++;
            }
        }
        return new int[0];
    }
}