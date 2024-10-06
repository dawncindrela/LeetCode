class Solution 
{
    public int[] getNoZeroIntegers(int n) 
    {
        int[] ans=new int[2];
        for(int i=1;i<=n/2;i++)
        {
            if(i+(n-i)==n)
            {
                if(!Integer.toString(i).contains("0") && !Integer.toString(n-i).contains("0"))
                {
                    ans[0]=i;
                    ans[1]=n-i;
                    break;
                }
            }
        }
        return ans;
    }
}