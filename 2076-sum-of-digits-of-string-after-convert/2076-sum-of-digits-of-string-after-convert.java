class Solution 
{
    public int getLucky(String s, int k) 
    {
        StringBuilder sb = new StringBuilder();
        for(char ch:s.toCharArray())
        {
            sb.append(ch-'a'+1);
        }
        int sum=0;
        for(char ch:sb.toString().toCharArray())
        {
            sum+=ch-'0';
        }
        while(--k>0)
        {
            int s1=0;
            while(sum>0)
            {
                s1+=sum%10;
                sum/=10;
            }
            sum=s1;
        }
        return sum;
    }
}