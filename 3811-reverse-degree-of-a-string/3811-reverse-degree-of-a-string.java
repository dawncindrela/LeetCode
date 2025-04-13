class Solution 
{
    public int reverseDegree(String s) 
    {
        int len = s.length();
        int sum=0;
        for(int i=0;i<len;i++)
        {
            int l = 26 - (s.charAt(i) - 'a');
            sum+= (l*(i+1));
        }
        return sum;
    }
}