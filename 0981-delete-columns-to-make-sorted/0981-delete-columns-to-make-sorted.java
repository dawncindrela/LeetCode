class Solution 
{
    public int minDeletionSize(String[] strs) 
    {
        int rows = strs.length;
        int cols = strs[0].length();
        int c=0;
        for(int i=0;i<cols;i++)
        {
            for(int j=1;j<rows;j++)
            {
                char prev=strs[j-1].charAt(i);
                if(strs[j].charAt(i) < prev)
                {
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}