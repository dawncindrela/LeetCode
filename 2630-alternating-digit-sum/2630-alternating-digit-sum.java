class Solution 
{
    public int alternateDigitSum(int n) 
    {
        int s=1;
        int altsum=0;
        int rev=0;
        while(n>0)
        {
            int d=n%10;
            rev=rev*10 + d;
            n/=10;
        }
        while(rev>0)
        {
            int d=rev%10;
            altsum+=(d*s);
            rev/=10;
            s*=-1;
        }
        return altsum;
    }
}