class Solution 
{
    public int sumOfTheDigitsOfHarshadNumber(int x) 
    {
        int y=x;
        int sum=0;
        int d=0;
        while(x>0)
        {
            d=x%10;
            sum+=d;
            x/=10;
        }
        if(y%sum==0)
        {
            return sum;
        }
        return -1;
    }
}