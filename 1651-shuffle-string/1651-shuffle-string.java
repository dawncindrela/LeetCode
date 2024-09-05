class Solution 
{
    public String restoreString(String s, int[] indices) 
    {
        int n=s.length();
        char[] shuf = new char[n];
        for(int i=0;i<n;i++)
        {
            shuf[indices[i]]=s.charAt(i);
        }
        return new String(shuf);
    }
}