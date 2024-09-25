class Solution 
{
    public int countAsterisks(String s) 
    {
        int c=0;
        int ans=0;
        for(char e:s.toCharArray())
        {
            if(e=='|')
            {
                c++;
            }
            if(c%2==0 && e=='*')
            {
                ans++;
            }
        }
        return ans;
    }
}