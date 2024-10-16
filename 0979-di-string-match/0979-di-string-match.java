class Solution 
{
    public int[] diStringMatch(String s) 
    {
        int n = s.length();
        int[] perm = new int[n+1];
        int min=0;
        int max=n;
        int i=0;
        for(i=0;i<n;i++)
        {
            perm[i]=s.charAt(i)=='I'?min++:max--;
        }
        perm[i]=min;
        return perm;
    }
}