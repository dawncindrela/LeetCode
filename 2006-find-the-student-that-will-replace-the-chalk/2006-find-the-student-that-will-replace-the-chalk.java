class Solution 
{
    public int chalkReplacer(int[] chalk, int k) 
    {
        long total = 0;
        for(int studchalk : chalk)
        {
            total+=studchalk;
        }
        int ch=(int)(k%total);
        for(int i=0;i<chalk.length;i++)
        {
            if(ch<chalk[i])
            {
                return i;
            }
            ch-=chalk[i];
        }
        return 0;
    }
}