class Solution 
{
    public int countBinarySubstrings(String s) 
    {
        int n=s.length();
        int prev= 0;
        int curr= 1;
        int res = 0;
        for(int i=0;i<n-1;i++)
        {
            char ch = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(ch==ch2)
            {
                curr++;
            }
            else
            {
                res+=Math.min(curr,prev);
                prev=curr;
                curr=1;
            }
        }
        res += Math.min(prev,curr);
        return res;
    }
}