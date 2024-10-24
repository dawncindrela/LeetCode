class Solution 
{
    public int countPrefixes(String[] words, String s) 
    {
        int c=0;
        int n = words.length;
        for(int i=0;i<n;i++)
        {
            if(s.startsWith(words[i]))
            {
                c++;
            }
        }
        return c;
    }
}