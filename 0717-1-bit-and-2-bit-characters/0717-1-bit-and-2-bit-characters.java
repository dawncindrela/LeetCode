class Solution 
{
    public boolean isOneBitCharacter(int[] bits) 
    {
        int n = bits.length;
        int c=0;
        while(c<n-1)
        {
            if(bits[c]==1)
            {
                c+=2;
            }
            else
            {
                c+=1;
            }
        }
        return c==(n-1);
    }
}