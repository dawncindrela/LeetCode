class Solution 
{
    public double trimMean(int[] arr) 
    {
        int n = arr.length;
        int a = (int)(0.05 *n);
        Arrays.sort(arr);
        double m=0;
        int c=0;
        for(int i=a;i<n-a;i++)
        {
            m+=arr[i];
            c++;
        }
        return (double)(m/c);
    }
}