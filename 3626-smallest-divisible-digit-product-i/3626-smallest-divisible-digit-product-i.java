class Solution 
{
    public int smallestNumber(int n, int t) 
    {
        int num = n;
        while(true)
        {
            int p=1;
            int temp = num;
            while(temp>0)
            {
                p*=(temp%10);
                temp/=10;
            }
            if(p%t == 0)
            {
                return num;
            }
            num++;
        }
    }
}