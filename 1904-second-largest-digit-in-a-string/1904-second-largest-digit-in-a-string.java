class Solution 
{
    public int secondHighest(String s) 
    {
        int max=-1;
        int second=-1;
        for(char ch : s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                int i=ch-'0';
                if(i>max)
                {
                    second=max;
                    max=i;
                }
                else if(i>second && i!=max)
                {
                    second=i;
                }
            }
        }
        return second;
    }
}