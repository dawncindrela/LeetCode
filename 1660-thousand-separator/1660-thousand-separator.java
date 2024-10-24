class Solution 
{
    public String thousandSeparator(int n) 
    {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        if(sb.length()<=3)
        {
            return sb.toString();
        }
        StringBuilder sb1 = new StringBuilder();
        int a = sb.length();
        int c=0;
        for(int i=a-1;i>=0;i--)
        {
            sb1.append(sb.charAt(i));
            c++;
            if(c==a)
            {
                break;
            }
            if(c%3==0)
            {
                sb1.append(".");
            }
        }
        return sb1.reverse().toString();
    }
}