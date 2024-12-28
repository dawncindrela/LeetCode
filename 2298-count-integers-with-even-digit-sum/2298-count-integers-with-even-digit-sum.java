class Solution 
{
    public int countEven(int num) 
    {
        int c=0;
        for(int i=1;i<=num;i++)
        {
            if(digisum(i) % 2 == 0)
            {
                c++;
            }
        }
        return c;
    }
    private int digisum(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}