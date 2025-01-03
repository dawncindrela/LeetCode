class Solution 
{
    public boolean isPrefixString(String s, String[] words) 
    {
        int n = words.length;
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<n;i++)
        {
            sb.append(words[i]);
            if(s.equals(sb.toString()))
            {
                return true;
            }
            if(s.indexOf(sb.toString())==-1)
            {
                return false;
            }
        }
        return false;
    }
}