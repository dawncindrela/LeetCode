class Solution 
{
    public String removeTrailingZeros(String num) 
    {
        int n =num.length();
        int j=0;
        for(int i=n-1;i>=0;i--)
        {
            char ch = num.charAt(i);
            if(ch=='0')
            {
                j++;
            }
            else
            {
                break;
            }
        }
        return num.substring(0,n-j);
    }
}