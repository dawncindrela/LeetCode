class Solution 
{
    public int numberOfAlternatingGroups(int[] colors) 
    {
        int n = colors.length;
        int c=0;
        for(int i=0;i<n-2;i++)
        {
            if(colors[i]==colors[i+2] && colors[i]!=colors[i+1])
            {
                c++;
            }
        }
        if(colors[n-1]==colors[1] && colors[0]!=colors[1])
        {
            c++;
        }
        if(colors[n-2]==colors[0] && colors[0]!=colors[n-1])
        {
            c++;
        }
        return c;
    }
}