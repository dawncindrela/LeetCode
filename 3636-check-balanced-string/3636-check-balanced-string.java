class Solution 
{
    public boolean isBalanced(String num) 
    {
        int n = num.length();
        int even = 0;
        int odd = 0;
        for(int i=0;i<n;i++)
        {
            if(i % 2 == 0)
            {
                even += (num.charAt(i)-'0');
            }
            else
            {
                odd += (num.charAt(i)-'0');
            }
        }
        return (odd==even);
    }
}