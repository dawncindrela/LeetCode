class Solution 
{
    public int pivotInteger(int n) 
    {
        for(int k=1;k<=n;k++)
        {
            int x = k;
            int s=0,t=0;
            for(int i=1;i<=x;i++)
            {
                s+=i;
            }
            for(int i=x;i<=n;i++)
            {
                t+=i;
            }
            if(s==t)
            {
                return x;
            }
        }
        return -1;
    }
}