class Solution 
{
    public int smallestRepunitDivByK(int k) 
    {
        if(k==1) 
            return 1;
        if(k%2==0 || k%5==0) 
            return -1;
        int rem = 0;
        for(int j=1;j<=k;j++)
        {
            rem = (rem*10+1)%k;
            if(rem==0) 
                return j;
        }
        return -1;
    }
}